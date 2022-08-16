package kamino.internal

import io.ktor.client.*
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.http.content.*
import kamino.NDCLANG
import kamino.model.SessionInfo
import kamino.exception.AminoException
import kamino.model.response.BaseResponseModel
import kamino.model.response.BaseWebResponseModel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationException
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

    private suspend fun HttpResponse.checkMobileResponse(): HttpResponse {
        if (status.value !in (200..299)) {
            if (status.value == 403) throw AminoException(403, "403 Forbidden")
            else if (status.value == 503) throw AminoException(503, "503 Service Temporarily Unavailable")
            val decodedResponse = json.decodeFromString<BaseResponseModel>(bodyAsText())
            throw AminoException(decodedResponse.apiStatusCode, decodedResponse.apiMessage)
        }
        return this
    }

    private suspend fun HttpResponse.checkWebResponse(): HttpResponse {
        try {
            val decodedResponse = json.decodeFromString<BaseWebResponseModel>(bodyAsText())
            if (decodedResponse.code != 200) {
                throw AminoException(
                    decodedResponse.apiStatusCode ?: status.value,
                    decodedResponse.message ?: "${status.value} ${status.description}"
                )
            }
        } catch (e: SerializationException) {
            throw AminoException(status.value, "${status.value} ${status.description}")
        }
        return this
    }

    private suspend fun HttpResponse.checkResponse(webRequest: Boolean): HttpResponse {
        return if (webRequest) checkWebResponse()
        else checkMobileResponse()
    }

    suspend fun execute(requestMethod: String,
                        endpoint: String,
                        contentType: ContentType? = null,
                        body: ByteArray? = null,
                        params: Map<String, String>? = null,
                        deviceID: String? = null,
                        webRequest: Boolean = false) = client.request {
        method = HttpMethod.parse(requestMethod)
        val h = if (webRequest) {
             AminoWebHeaders.get()
        } else if (body == null) {
            AminoMobileHeaders.get()
        } else {
            AminoMobileHeaders.getWith(body)
        }
        if (body != null) setBody(ByteArrayContent(body, contentType))
        if (deviceID != null) (h as AminoMobileHeaders).device(deviceID)
        if (sessionInfo != null) h.sid("sid=${sessionInfo?.sid}")
        url {
            protocol = URLProtocol.HTTPS
            host = if (webRequest) "aminoapps.com" else "service.narvii.com"
            path(if (webRequest) "api/$endpoint" else "api/v1/$endpoint")
            params?.forEach { parameters.append(it.key, it.value) }
        }
        headers(h.lang(lang.headerString)::use)
    }.checkResponse(webRequest)

    suspend inline fun <reified T> postJson(endpoint: String,
                                            data: T,
                                            deviceID: String? = null,
                                            webRequest: Boolean = false) = execute(
            "POST",
            endpoint,
            ContentType.Application.Json,
            json.encodeToString(data).toByteArray(Charsets.UTF_8),
            deviceID = deviceID,
            webRequest = webRequest
    )

    suspend fun postRawBytes(endpoint: String, data: ByteArray, type: String) = execute(
        "POST",
        endpoint,
        ContentType.parse(type),
        data
    )

    suspend inline fun <reified T> webPostJson(endpoint: String, data: T) = postJson(endpoint, data, webRequest = true)

    suspend fun get(endpoint: String, vararg params: Pair<String, String>) = execute("GET", endpoint, params = mapOf(*params))

    suspend fun delete(endpoint: String) = execute("DELETE", endpoint)
}
