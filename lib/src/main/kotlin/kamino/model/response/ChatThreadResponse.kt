package kamino.model.response


import kamino.model.ChatThread
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatThreadResponse(
    @SerialName("api:duration")
    val apiDuration: String,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:statuscode")
    val apiStatusCode: Int,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("thread")
    val thread: ChatThread
)
