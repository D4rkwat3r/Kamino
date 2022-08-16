package kamino.model.request


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    @SerialName("action")
    val action: String,
    @SerialName("clientType")
    val clientType: Int,
    @SerialName("deviceID")
    val deviceID: String,
    @SerialName("secret")
    val secret: String,
    @SerialName("timestamp")
    val timestamp: Long = System.currentTimeMillis(),
    @SerialName("v")
    val v: Int = 2,
    @SerialName("email")
    var email: String? = null,
    @SerialName("phoneNumber")
    var phoneNumber: String? = null,
)
