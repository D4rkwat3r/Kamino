package kamino.internal.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinkInfoV2(
    @SerialName("extensions")
    val extensions: Extensions,
    @SerialName("path")
    val path: String
) {
    @Serializable
    data class Extensions(
        @SerialName("linkInfo")
        val linkInfo: LinkInfo
    ) {
        @Serializable
        data class LinkInfo(
            @SerialName("fullPath")
            val fullPath: String?,
            @SerialName("ndcId")
            val ndcId: Int,
            @SerialName("objectId")
            val objectId: String,
            @SerialName("objectType")
            val objectType: Int,
            @SerialName("shareURLFullPath")
            val shareURLFullPath: String?,
            @SerialName("shareURLShortCode")
            val shareURLShortCode: String?,
            @SerialName("shortCode")
            val shortCode: String?,
            @SerialName("targetCode")
            val targetCode: Int
        )
    }
}
