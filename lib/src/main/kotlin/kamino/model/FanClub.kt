package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FanClub(
    @SerialName("createdTime")
    val createdTime: String,
    @SerialName("expiredTime")
    val expiredTime: String,
    @SerialName("fansStatus")
    val fansStatus: Int,
    @SerialName("targetUserProfile")
    val targetUserProfile: UserProfile?,
    @SerialName("fansUserProfile")
    val fansUserProfile: UserProfile?,
    @SerialName("lastThankedTime")
    val lastThankedTime: String?,
    @SerialName("uid")
    val uid: String
)
