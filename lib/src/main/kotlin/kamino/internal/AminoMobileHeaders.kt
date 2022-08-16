package kamino.internal

import io.ktor.http.*
import io.ktor.util.*
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class AminoMobileHeaders private constructor(): AminoHeaders() {

    init {
        put("User-Agent", Constants.mobileUserAgent)
    }

    fun device(value: String): AminoMobileHeaders {
        put("NDCDEVICEID", value)
        return this
    }
    fun signature(value: String): AminoMobileHeaders {
        put("NDC-MSG-SIG", value)
        return this
    }
    override fun lang(value: String): AminoMobileHeaders {
        put("NDCLANG", value)
        put("Accept-Language", value)
        return this
    }
    override fun sid(value: String): AminoMobileHeaders {
        put("NDCAUTH", value)
        return this
    }
    override fun use(builder: HeadersBuilder) {
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
        fun get(): AminoMobileHeaders = AminoMobileHeaders()
        @JvmStatic
        fun getWith(data: ByteArray): AminoMobileHeaders = AminoMobileHeaders().signature(generateSignature(data))
    }
}
