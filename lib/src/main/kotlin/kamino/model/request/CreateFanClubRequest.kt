package kamino.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreateFanClubRequest(
    @SerialName("monthlyFee")
    val monthlyFee: Int,
    @SerialName("timestamp")
    val timestamp: Long = System.currentTimeMillis()
)
