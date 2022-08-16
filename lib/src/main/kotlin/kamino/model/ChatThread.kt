package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatThread(
    @SerialName("alertOption")
    val alertOption: Int,
    @SerialName("author")
    val author: UserProfile,
    @SerialName("condition")
    val condition: Int,
    @SerialName("content")
    val content: String?,
    @SerialName("extensions")
    val extensions: Extensions,
    @SerialName("icon")
    val icon: String?,
    @SerialName("isPinned")
    val isPinned: Boolean = false,
    @SerialName("membersCount")
    val membersCount: Int,
    @SerialName("membersQuota")
    val membersQuota: Int,
    @SerialName("membershipStatus")
    val membershipStatus: Int,
    @SerialName("ndcId")
    val ndcId: Int,
    @SerialName("needHidden")
    val needHidden: Boolean,
    @SerialName("publishToGlobal")
    val publishToGlobal: Int?,
    @SerialName("status")
    val status: Int,
    @SerialName("threadId")
    val threadId: String,
    @SerialName("title")
    val title: String?,
    @SerialName("type")
    val type: Int,
    @SerialName("uid")
    val uid: String
) {

    @Serializable
    data class Extensions(
        @SerialName("avchatMemberUidList")
        val avChatMemberUidList: List<String> = emptyList(),
        @SerialName("bannedMemberUidList")
        val bannedMemberUidList: List<String> = emptyList(),
        @SerialName("bm")
        val backgroundImage: MediaObject?,
        @SerialName("channelType")
        val channelType: Int?,
        @SerialName("coHost")
        val coHost: List<String> = emptyList(),
        @SerialName("creatorUid")
        val creatorUid: String?,
        @SerialName("__disabledTime__")
        val disabledTime: Int?,
        @SerialName("fansOnly")
        val fansOnly: Boolean = false,
        @SerialName("language")
        val language: String?,
        @SerialName("lastMembersSummaryUpdateTime")
        val lastMembersSummaryUpdateTime: Int?,
        @SerialName("membersCanInvite")
        val membersCanInvite: Boolean = true,
        @SerialName("pinAnnouncement")
        val pinAnnouncement: Boolean = false,
        @SerialName("viewOnly")
        val viewOnly: Boolean = false,
        @SerialName("visibility")
        val visibility: Int?,
        @SerialName("vvChatJoinType")
        val vvChatJoinType: Int?
    )
}
