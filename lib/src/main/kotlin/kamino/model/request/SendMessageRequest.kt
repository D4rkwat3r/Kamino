package kamino.model.request


import kamino.model.AttachedObject
import kamino.model.MediaObject
import kamino.model.Mention
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class SendMessageRequest(
    @SerialName("content")
    val content: String?,
    @SerialName("type")
    val type: Int,
    @SerialName("mediaType")
    var mediaType: Int,
    @SerialName("stickerId")
    var stickerId: String? = null,
    @SerialName("attachedObject")
    var attachedObject: AttachedObject? = null,
    @SerialName("mediaUhqEnabled")
    var mediaUhqEnabled: Boolean? = null,
    @SerialName("mediaUploadValue")
    var mediaUploadValue: String? = null,
    @SerialName("mediaUploadValueContentType")
    var mediaUploadValueContentType: String? = null,
    @SerialName("mediaValue")
    var mediaValue: String? = null,
    @SerialName("clientRefId")
    val clientRefId: Int = (Instant.now().epochSecond / 10 % 1000000000).toInt(),
    @SerialName("extensions")
    val extensions: Extensions = Extensions(null, null),
    @SerialName("timestamp")
    val timestamp: Long = System.currentTimeMillis()
) {
    @Serializable
    data class Extensions(
        @SerialName("mentionedArray")
        var mentionedArray: List<Mention>?,
        @SerialName("linkSnippetList")
        var linkSnippetList: List<LinkSnippet>?
    )
    @Serializable
    data class LinkSnippet(
        @SerialName("link")
        val link: String,
        @SerialName("mediaType")
        val mediaType: Int,
        @SerialName("mediaUploadValue")
        val mediaUploadValue: String,
        @SerialName("mediaUploadValueContentType")
        val mediaUploadValueContentType: String
    )
}
