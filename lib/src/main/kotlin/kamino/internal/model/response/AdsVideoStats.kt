package kamino.internal.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AdsVideoStats(
    @SerialName("canEarnedCoins")
    val canEarnedCoins: Int,
    @SerialName("canWatchVideo")
    val canWatchVideo: Boolean,
    @SerialName("nextWatchVideoInterval")
    val nextWatchVideoInterval: Int,
    @SerialName("watchVideoMaxCount")
    val watchVideoMaxCount: Int,
    @SerialName("watchedVideoCount")
    val watchedVideoCount: Int
)
