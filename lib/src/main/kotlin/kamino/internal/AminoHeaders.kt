package kamino.internal

import io.ktor.http.*

abstract class AminoHeaders : MutableMap<String, String> by mutableMapOf() {
    abstract fun lang(value: String): AminoHeaders
    abstract fun sid(value: String): AminoHeaders
    abstract fun use(builder: HeadersBuilder)
}
