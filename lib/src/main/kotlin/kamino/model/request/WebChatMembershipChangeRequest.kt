package kamino.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebChatMembershipChangeRequest(
    @SerialName("ndcId")
    val ndcId: String,
    @SerialName("threadId")
    val threadId: String,
)
