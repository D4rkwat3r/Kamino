package kamino.internal.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Wallet(
    @SerialName("adsEnabled")
    val adsEnabled: Boolean,
    @SerialName("adsFlags")
    val adsFlags: Int,
    @SerialName("adsVideoStats")
    val adsVideoStats: AdsVideoStats,
    @SerialName("businessCoinsEnabled")
    val businessCoinsEnabled: Boolean,
    @SerialName("totalBusinessCoins")
    val totalBusinessCoins: Int,
    @SerialName("totalBusinessCoinsFloat")
    val totalBusinessCoinsFloat: Int,
    @SerialName("totalCoins")
    val totalCoins: Float,
    @SerialName("totalCoinsFloat")
    val totalCoinsFloat: Float
)
