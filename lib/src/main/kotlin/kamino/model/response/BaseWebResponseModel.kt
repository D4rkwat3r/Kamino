package kamino.model.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseWebResponseModel(
    @SerialName("code")
    val code: Int,
    @SerialName("api_status_code")
    val apiStatusCode: Int?,
    @SerialName("message")
    val message: String?,
)
