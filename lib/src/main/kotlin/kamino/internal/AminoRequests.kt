package kamino.internal

import io.ktor.client.*
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.http.content.*
import kamino.NDCLANG
import kamino.internal.model.SessionInfo
import kamino.exception.AminoException
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class AminoRequests {

    private val client = HttpClient(CIO)
    @OptIn(ExperimentalSerializationApi::class)
    val json: Json = Json {
        encodeDefaults = true
        ignoreUnknownKeys = true
        explicitNulls = false
    }
    var sessionInfo: SessionInfo? = null
    var lang: NDCLANG = NDCLANG.EN

    private suspend fun HttpResponse.checkResponse(): HttpResponse {
        if (status.value !in (200..299)) {
            if (status.value == 403) throw AminoException(403, "403 Forbidden")
            val decodedResponse = json.decodeFromString<BaseResponseModel>(bodyAsText())
            throw AminoException(decodedResponse.apiStatusCode, decodedResponse.apiMessage)
        }
        return this
    }

    suspend fun execute(requestMethod: String,
                        endpoint: String,
                        contentType: ContentType? = null,
                        body: ByteArray? = null,
                        params: Map<String, String>? = null,
                        deviceID: String? = null) = client.request {
        method = HttpMethod.parse(requestMethod)
        val h = if (body == null) AminoHeaders.get() else {
            setBody(ByteArrayContent(body, contentType))
            AminoHeaders.getWith(body)
        }
        if (deviceID != null) h.device(deviceID)
        if (sessionInfo != null) h.sid("sid=${sessionInfo?.sid}")
        url {
            protocol = URLProtocol.HTTP
            host = "service.narvii.com"
            path("api/v1/$endpoint")
            params?.forEach { parameters.append(it.key, it.value) }
        }
        headers(h.lang(lang.headerString)::use)
    }.checkResponse()

    suspend inline fun <reified T> postJson(endpoint: String, data: T, deviceID: String? = null) = execute(
        "POST",
        endpoint,
        ContentType.Application.Json,
        json.encodeToString(data).toByteArray(Charsets.UTF_8),
        deviceID = deviceID
    )

    suspend fun get(endpoint: String, vararg params: Pair<String, String>) = execute("GET", endpoint, params = mapOf(*params))

    suspend fun delete(endpoint: String) = execute("DELETE", endpoint)
}
