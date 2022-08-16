package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatMessage(
    @SerialName("author")
    val author: UserProfile,
    @SerialName("chatBubbleId")
    val chatBubbleId: String?,
    @SerialName("clientRefId")
    val clientRefId: Int,
    @SerialName("content")
    val content: String?,
    @SerialName("createdTime")
    val createdTime: String,
    @SerialName("includedInSummary")
    val includedInSummary: Boolean,
    @SerialName("isHidden")
    val isHidden: Boolean,
    @SerialName("mediaType")
    val mediaType: Int,
    @SerialName("messageId")
    val messageId: String,
    @SerialName("threadId")
    val threadId: String,
    @SerialName("type")
    val type: Int,
    @SerialName("uid")
    val uid: String,
    @SerialName("mediaValue")
    val mediaValue: String?,
    @SerialName("extensions")
    val extensions: Extensions
) {
    @Serializable
    data class Extensions(
        @SerialName("mentionedArray")
        val mentionedArray: List<Mention>?,
        @SerialName("linkSnippetList")
        val linkSnippetList: List<LinkSnippet>?,
        @SerialName("attachedObjectInfo")
        val attachedObjectInfo: AttachedObject?
    )
}
