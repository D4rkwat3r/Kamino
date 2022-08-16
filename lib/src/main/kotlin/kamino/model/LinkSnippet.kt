package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinkSnippet(
    @SerialName("deepLink")
    val deepLink: String?,
    @SerialName("favicon")
    val favicon: String?,
    @SerialName("link")
    val link: String?,
    @SerialName("mediaList")
    val mediaList: List<MediaObject>,
    @SerialName("source")
    val source: String?,
    @SerialName("title")
    val title: String?
)
