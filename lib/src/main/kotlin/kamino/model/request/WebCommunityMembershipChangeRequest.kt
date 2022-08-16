package kamino.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebCommunityMembershipChangeRequest(
    @SerialName("ndcId")
    val ndcId: String
)
