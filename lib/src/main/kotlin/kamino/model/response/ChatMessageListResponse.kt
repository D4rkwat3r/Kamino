package kamino.model.response


import kamino.model.ChatMessage
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatMessageListResponse(
    @SerialName("api:duration")
    val apiDuration: String,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:statuscode")
    val apiStatusCode: Int,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("messageList")
    val messageList: List<ChatMessage>
)
