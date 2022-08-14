package kamino.internal


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseResponseModel(
    @SerialName("api:statuscode")
    val apiStatusCode: Int,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("api:duration")
    val apiDuration: String,
)
