package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommunityPreview(
    @SerialName("communityHeat")
    val communityHeat: Double,
    @SerialName("createdTime")
    val createdTime: String,
    @SerialName("endpoint")
    val endpoint: String,
    @SerialName("icon")
    val icon: String?,
    @SerialName("joinType")
    val joinType: Int,
    @SerialName("launchPage")
    val launchPage: LaunchPage?,
    @SerialName("link")
    val link: String,
    @SerialName("listedStatus")
    val listedStatus: Int,
    @SerialName("membersCount")
    val membersCount: Int,
    @SerialName("modifiedTime")
    val modifiedTime: String,
    @SerialName("name")
    val name: String,
    @SerialName("ndcId")
    val ndcId: Int,
    @SerialName("primaryLanguage")
    val primaryLanguage: String,
    @SerialName("probationStatus")
    val probationStatus: Int,
    @SerialName("promotionalMediaList")
    val promotionalMediaList: List<MediaObject>?,
    @SerialName("status")
    val status: Int,
    @SerialName("strategyInfo")
    val strategyInfo: String,
    @SerialName("tagline")
    val tagline: String,
    @SerialName("templateId")
    val templateId: Int,
    @SerialName("themePack")
    val themePack: Community.ThemePack,
    @SerialName("updatedTime")
    val updatedTime: String?
) {
    @Serializable
    data class LaunchPage(
        @SerialName("mediaList")
        val mediaList: List<MediaObject>?,
        @SerialName("title")
        val title: String
    )
}
