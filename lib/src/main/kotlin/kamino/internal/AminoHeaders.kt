package kamino.internal

import io.ktor.http.*
import io.ktor.util.*
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class AminoHeaders private constructor(): MutableMap<String, String> by mutableMapOf() {

    init {
        put("User-Agent", Constants.mobileUserAgent)
    }

    fun lang(value: String): AminoHeaders {
        put("NDCLANG", value)
        put("Accept-Language", value)
        return this
    }
    fun device(value: String): AminoHeaders {
        put("NDCDEVICEID", value)
        return this
    }
    fun signature(value: String): AminoHeaders {
        put("NDC-MSG-SIG", value)
        return this
    }
    fun sid(value: String): AminoHeaders {
        put("NDCAUTH", value)
        return this
    }
    fun use(builder: HeadersBuilder) {
        if (!containsKey("NDCDEVICEID")) { put("NDCDEVICEID", generateDeviceID()) }
        forEach { builder.append(it.key, it.value) }
    }

    companion object {
        @JvmStatic
        fun generateSignature(data: ByteArray): String {
            val mac = Mac.getInstance("HmacSHA1")
            mac.init(SecretKeySpec(Constants.ndcSigKey, "HmacSHA1"))
            mac.update(data)
            return Constants.encoder.encodeToString(Constants.ndcPrefix + mac.doFinal())
        }
        @JvmStatic
        fun generateDeviceID(): String {
            val token = ByteArray(15)
            Random().nextBytes(token)
            val mac = Mac.getInstance("HmacSHA1")
            mac.init(SecretKeySpec(Constants.ndcDeviceKey, "HmacSHA1"))
            mac.update(Constants.ndcPrefix)
            mac.update(token)
            return hex(Constants.ndcPrefix) + hex(token) + hex(mac.doFinal())
        }
        @JvmStatic
        fun get(): AminoHeaders = AminoHeaders()
        @JvmStatic
        fun getWith(data: ByteArray): AminoHeaders = AminoHeaders().signature(generateSignature(data))
    }
}
