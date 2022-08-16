package kamino.internal

import io.ktor.http.*

class AminoWebHeaders private constructor(): AminoHeaders() {

    init {
        put("User-Agent", Constants.webUserAgent)
        put("X-Requested-With", "XMLHttpRequest")
    }

    override fun lang(value: String): AminoHeaders {
        put("Accept-Language", value)
        return this
    }

    override fun sid(value: String): AminoHeaders {
        put("cookie", value)
        return this
    }

    override fun use(builder: HeadersBuilder) = forEach { builder.append(it.key, it.value) }

    companion object {
        @JvmStatic
        fun get(): AminoWebHeaders = AminoWebHeaders()
    }
}
