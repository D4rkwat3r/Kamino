package kamino.model.response


import kamino.model.UserProfile
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserProfileListResponse(
    @SerialName("api:duration")
    val apiDuration: String,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:statuscode")
    val apiStatusCode: Int,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("userProfileList")
    val userProfileList: List<UserProfile>
)
