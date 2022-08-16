package kamino.model.request


import kamino.MediaType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebSendMessageRequest(
    @SerialName("ndcId")
    val ndcId: String,
    @SerialName("threadId")
    val threadId: String,
    @SerialName("message")
    val message: Message
) {
    @Serializable
    data class Message(
        @SerialName("content")
        val content: String,
        @SerialName("type")
        val type: Int,
        @SerialName("mediaType")
        val mediaType: Int = MediaType.DEFAULT.identifier,
        @SerialName("clientRefId")
        val clientRefId: Int = 0,
    )
}
