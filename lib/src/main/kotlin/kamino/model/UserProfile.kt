package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserProfile(
    @SerialName("accountMembershipStatus")
    val accountMembershipStatus: Int,
    @SerialName("aminoId")
    val aminoId: String?,
    @SerialName("avatarFrame")
    val avatarFrame: AvatarFrame?,
    @SerialName("avatarFrameId")
    val avatarFrameId: String?,
    @SerialName("commentsCount")
    val commentsCount: Int?,
    @SerialName("createdTime")
    val createdTime: String?,
    @SerialName("followingStatus")
    val followingStatus: Int?,
    @SerialName("icon")
    val icon: String?,
    @SerialName("isGlobal")
    val isGlobal: Boolean?,
    @SerialName("isNicknameVerified")
    val isNicknameVerified: Boolean?,
    @SerialName("itemsCount")
    val itemsCount: Int?,
    @SerialName("joinedCount")
    val joinedCount: Int?,
    @SerialName("level")
    val level: Int,
    @SerialName("membersCount")
    val membersCount: Int?,
    @SerialName("membershipStatus")
    val membershipStatus: Int?,
    @SerialName("modifiedTime")
    val modifiedTime: String?,
    @SerialName("ndcId")
    val ndcId: Int?,
    @SerialName("nickname")
    val nickname: String,
    @SerialName("notificationSubscriptionStatus")
    val notificationSubscriptionStatus: Int?,
    @SerialName("onlineStatus")
    val onlineStatus: Int?,
    @SerialName("postsCount")
    val postsCount: Int?,
    @SerialName("pushEnabled")
    val pushEnabled: Boolean?,
    @SerialName("reputation")
    val reputation: Int,
    @SerialName("role")
    val role: Int,
    @SerialName("status")
    val status: Int,
    @SerialName("uid")
    val uid: String
) {
    @Serializable
    data class AvatarFrame(
        @SerialName("frameId")
        val frameId: String,
        @SerialName("frameType")
        val frameType: Int,
        @SerialName("icon")
        val icon: String,
        @SerialName("name")
        val name: String,
        @SerialName("resourceUrl")
        val resourceUrl: String,
        @SerialName("status")
        val status: Int,
        @SerialName("version")
        val version: Int
    )
}
