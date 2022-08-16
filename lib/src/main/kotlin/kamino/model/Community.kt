package kamino.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Community(
    @SerialName("advancedSettings")
    val advancedSettings: AdvancedSettings?,
    @SerialName("agent")
    val agent: UserProfile?,
    @SerialName("communityHeadList")
    val communityHeadList: List<UserProfile?>?,
    @SerialName("communityHeat")
    val communityHeat: Double?,
    @SerialName("configuration")
    val configuration: Configuration?,
    @SerialName("content")
    val content: String?,
    @SerialName("createdTime")
    val createdTime: String?,
    @SerialName("endpoint")
    val endpoint: String,
    @SerialName("icon")
    val icon: String?,
    @SerialName("influencerList")
    val influencerList: List<UserProfile>,
    @SerialName("isStandaloneAppDeprecated")
    val isStandaloneAppDeprecated: Boolean,
    @SerialName("isStandaloneAppMonetizationEnabled")
    val isStandaloneAppMonetizationEnabled: Boolean?,
    @SerialName("joinType")
    val joinType: Int,
    @SerialName("keywords")
    val keywords: String?,
    @SerialName("link")
    val link: String,
    @SerialName("listedStatus")
    val listedStatus: Int,
    @SerialName("mediaList")
    val mediaList: List<MediaObject>?,
    @SerialName("membersCount")
    val membersCount: Int,
    @SerialName("modifiedTime")
    val modifiedTime: String,
    @SerialName("name")
    val name: String,
    @SerialName("ndcId")
    val ndcId: Int,
    @SerialName("primaryLanguage")
    val primaryLanguage: String?,
    @SerialName("probationStatus")
    val probationStatus: Int?,
    @SerialName("promotionalMediaList")
    val promotionalMediaList: List<MediaObject>?,
    @SerialName("searchable")
    val searchable: Boolean,
    @SerialName("status")
    val status: Int,
    @SerialName("tagline")
    val tagline: String?,
    @SerialName("templateId")
    val templateId: Int,
    @SerialName("themePack")
    val themePack: ThemePack,
    @SerialName("updatedTime")
    val updatedTime: String,
    @SerialName("userAddedTopicList")
    val userAddedTopicList: List<UserAddedTopic>?
) {
    @Serializable
    data class AdvancedSettings(
        @SerialName("catalogEnabled")
        val catalogEnabled: Boolean?,
        @SerialName("defaultRankingTypeInLeaderboard")
        val defaultRankingTypeInLeaderboard: Int?,
        @SerialName("frontPageLayout")
        val frontPageLayout: Int?,
        @SerialName("hasPendingReviewRequest")
        val hasPendingReviewRequest: Boolean?,
        @SerialName("joinedBaselineCollectionIdList")
        val joinedBaselineCollectionIdList: List<String?>?,
        @SerialName("newsfeedPages")
        val newsfeedPages: List<NewsfeedPage?>?,
        @SerialName("pollMinFullBarVoteCount")
        val pollMinFullBarVoteCount: Int?,
        @SerialName("rankingTable")
        val rankingTable: List<RankingTable?>?,
        @SerialName("welcomeMessageEnabled")
        val welcomeMessageEnabled: Boolean?,
        @SerialName("welcomeMessageText")
        val welcomeMessageText: String?
    ) {

        @Serializable
        data class NewsfeedPage(
            @SerialName("status")
            val status: Int?,
            @SerialName("type")
            val type: Int?
        )

        @Serializable
        data class RankingTable(
            @SerialName("id")
            val id: String?,
            @SerialName("level")
            val level: Int?,
            @SerialName("reputation")
            val reputation: Int?,
            @SerialName("title")
            val title: String?
        )
    }

    @Serializable
    data class Configuration(
        @SerialName("general")
        val general: General?,
        @SerialName("module")
        val module: Module?,
        @SerialName("page")
        val page: Page?
    ) {

        @Serializable
        data class General(
            @SerialName("accountMembershipEnabled")
            val accountMembershipEnabled: Boolean?,
            @SerialName("disableLiveLayerActive")
            val disableLiveLayerActive: Boolean?,
            @SerialName("disableLiveLayerVisible")
            val disableLiveLayerVisible: Boolean?,
            @SerialName("disableLocation")
            val disableLocation: Boolean?,
            @SerialName("hasPendingReviewRequest")
            val hasPendingReviewRequest: Boolean?,
            @SerialName("invitePermission")
            val invitePermission: Int?,
            @SerialName("joinedBaselineCollectionIdList")
            val joinedBaselineCollectionIdList: List<String?>?,
            @SerialName("joinedTopicIdList")
            val joinedTopicIdList: List<Int?>?,
            @SerialName("onlyAllowOfficialTag")
            val onlyAllowOfficialTag: Boolean?,
            @SerialName("premiumFeatureEnabled")
            val premiumFeatureEnabled: Boolean?,
            @SerialName("videoUploadPolicy")
            val videoUploadPolicy: Int?,
            @SerialName("welcomeMessage")
            val welcomeMessage: WelcomeMessage?
        ) {
            @Serializable
            data class WelcomeMessage(
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("text")
                val text: String?
            )
        }

        @Serializable
        data class Module(
            @SerialName("catalog")
            val catalog: Catalog?,
            @SerialName("chat")
            val chat: Chat?,
            @SerialName("externalContent")
            val externalContent: ExternalContent?,
            @SerialName("featured")
            val featured: Featured?,
            @SerialName("influencer")
            val influencer: Influencer?,
            @SerialName("post")
            val post: Post?,
            @SerialName("ranking")
            val ranking: Ranking?,
            @SerialName("sharedFolder")
            val sharedFolder: SharedFolder?,
            @SerialName("topicCategories")
            val topicCategories: TopicCategories?
        ) {
            @Serializable
            data class Catalog(
                @SerialName("curationEnabled")
                val curationEnabled: Boolean?,
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("privilege")
                val privilege: Privilege?
            ) {
                @Serializable
                data class Privilege(
                    @SerialName("minLevel")
                    val minLevel: Int?,
                    @SerialName("type")
                    val type: Int?
                )
            }

            @Serializable
            data class Chat(
                @SerialName("avChat")
                val avChat: AvChat?,
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("publicChat")
                val publicChat: PublicChat?,
                @SerialName("spamProtectionEnabled")
                val spamProtectionEnabled: Boolean?
            ) {
                @Serializable
                data class AvChat(
                    @SerialName("audio2Enabled")
                    val audio2Enabled: Boolean?,
                    @SerialName("audioEnabled")
                    val audioEnabled: Boolean?,
                    @SerialName("screeningRoomEnabled")
                    val screeningRoomEnabled: Boolean?,
                    @SerialName("videoEnabled")
                    val videoEnabled: Boolean?
                )

                @Serializable
                data class PublicChat(
                    @SerialName("enabled")
                    val enabled: Boolean?,
                    @SerialName("privilege")
                    val privilege: Privilege?
                ) {
                    @Serializable
                    data class Privilege(
                        @SerialName("minLevel")
                        val minLevel: Int?,
                        @SerialName("type")
                        val type: Int?
                    )
                }
            }

            @Serializable
            data class ExternalContent(
                @SerialName("enabled")
                val enabled: Boolean?
            )

            @Serializable
            data class Featured(
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("layout")
                val layout: Int?,
                @SerialName("lockMember")
                val lockMember: Boolean?,
                @SerialName("memberEnabled")
                val memberEnabled: Boolean?,
                @SerialName("postEnabled")
                val postEnabled: Boolean?,
                @SerialName("publicChatRoomEnabled")
                val publicChatRoomEnabled: Boolean?
            )

            @Serializable
            data class Influencer(
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("lock")
                val lock: Boolean?,
                @SerialName("maxVipMonthlyFee")
                val maxVipMonthlyFee: Int?,
                @SerialName("maxVipNumbers")
                val maxVipNumbers: Int?,
                @SerialName("minVipMonthlyFee")
                val minVipMonthlyFee: Int?
            )

            @Serializable
            data class Post(
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("postType")
                val postType: PostType?
            ) {
                @Serializable
                data class PostType(
                    @SerialName("blog")
                    val blog: Blog?,
                    @SerialName("catalogEntry")
                    val catalogEntry: CatalogEntry?,
                    @SerialName("image")
                    val image: Image?,
                    @SerialName("liveMode")
                    val liveMode: LiveMode?,
                    @SerialName("poll")
                    val poll: Poll?,
                    @SerialName("publicChatRooms")
                    val publicChatRooms: PublicChatRooms?,
                    @SerialName("question")
                    val question: Question?,
                    @SerialName("quiz")
                    val quiz: Quiz?,
                    @SerialName("screeningRoom")
                    val screeningRoom: ScreeningRoom?,
                    @SerialName("story")
                    val story: Story?,
                    @SerialName("webLink")
                    val webLink: WebLink?
                ) {
                    @Serializable
                    data class Blog(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class CatalogEntry(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class Image(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class LiveMode(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class Poll(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class PublicChatRooms(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class Question(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class Quiz(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class ScreeningRoom(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class Story(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }

                    @Serializable
                    data class WebLink(
                        @SerialName("enabled")
                        val enabled: Boolean?,
                        @SerialName("privilege")
                        val privilege: Privilege?
                    ) {
                        @Serializable
                        data class Privilege(
                            @SerialName("minLevel")
                            val minLevel: Int?,
                            @SerialName("type")
                            val type: Int?
                        )
                    }
                }
            }

            @Serializable
            data class Ranking(
                @SerialName("defaultLeaderboardType")
                val defaultLeaderboardType: Int?,
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("leaderboardEnabled")
                val leaderboardEnabled: Boolean?,
                @SerialName("leaderboardList")
                val leaderboardList: List<Leaderboard?>?,
                @SerialName("rankingTable")
                val rankingTable: List<RankingTable?>?
            ) {
                @Serializable
                data class Leaderboard(
                    @SerialName("enabled")
                    val enabled: Boolean?,
                    @SerialName("id")
                    val id: String?,
                    @SerialName("style")
                    val style: Style?,
                    @SerialName("type")
                    val type: Int?
                ) {
                    @Serializable
                    data class Style(
                        @SerialName("backgroundMediaList")
                        val backgroundMediaList: List<MediaObject>?
                    )
                }

                @Serializable
                data class RankingTable(
                    @SerialName("id")
                    val id: String?,
                    @SerialName("level")
                    val level: Int?,
                    @SerialName("reputation")
                    val reputation: Int?,
                    @SerialName("title")
                    val title: String?
                )
            }

            @Serializable
            data class SharedFolder(
                @SerialName("albumManagePrivilege")
                val albumManagePrivilege: AlbumManagePrivilege?,
                @SerialName("enabled")
                val enabled: Boolean?,
                @SerialName("uploadPrivilege")
                val uploadPrivilege: UploadPrivilege?
            ) {
                @Serializable
                data class AlbumManagePrivilege(
                    @SerialName("minLevel")
                    val minLevel: Int?,
                    @SerialName("type")
                    val type: Int?
                )

                @Serializable
                data class UploadPrivilege(
                    @SerialName("minLevel")
                    val minLevel: Int?,
                    @SerialName("type")
                    val type: Int?
                )
            }

            @Serializable
            data class TopicCategories(
                @SerialName("enabled")
                val enabled: Boolean?
            )
        }

        @Serializable
        data class Page(
            @SerialName("customList")
            val customList: List<Custom?>?,
            @SerialName("defaultList")
            val defaultList: List<Default?>?
        ) {
            @Serializable
            data class Custom(
                @SerialName("alias")
                val alias: String?,
                @SerialName("id")
                val id: String?,
                @SerialName("originalTitle")
                val originalTitle: String?,
                @SerialName("url")
                val url: String?
            )

            @Serializable
            data class Default(
                @SerialName("alias")
                val alias: String?,
                @SerialName("id")
                val id: String?,
                @SerialName("parentId")
                val parentId: String?,
                @SerialName("url")
                val url: String?
            )
        }
    }

    @Serializable
    data class ThemePack(
        @SerialName("themeColor")
        val themeColor: String?,
        @SerialName("themePackHash")
        val themePackHash: String?,
        @SerialName("themePackRevision")
        val themePackRevision: Int?,
        @SerialName("themePackUrl")
        val themePackUrl: String?
    )

    @Serializable
    data class UserAddedTopic(
        @SerialName("name")
        val name: String?,
        @SerialName("style")
        val style: Style?,
        @SerialName("topicId")
        val topicId: Int?
    ) {
        @Serializable
        data class Style(
            @SerialName("backgroundColor")
            val backgroundColor: String?
        )
    }
}
