package kamino.model.request


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StartChatRequest(
    @SerialName("inviteeUids")
    val invitedUserIds: List<String>,
    @SerialName("initialMessageContent")
    val initialMessageContent: String,
    @SerialName("title")
    var title: String,
    @SerialName("type")
    var type: Int,
    @SerialName("content")
    var content: String? = null,
    @SerialName("eventSource")
    var eventSource: String? = null,
    @SerialName("isGlobal")
    var isGlobal: Boolean? = null,
    @SerialName("publishToGlobal")
    var publishToGlobal: Boolean? = null,
    @SerialName("timestamp")
    val timestamp: Long = System.currentTimeMillis(),
)
