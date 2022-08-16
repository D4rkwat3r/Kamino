package kamino.model.response


import kamino.model.UserProfile
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebUserProfileResponse(
    @SerialName("result")
    val result: Result
) {
    @Serializable
    data class Result(
        val userProfile: UserProfile
    )
}
