package kamino.model.response


import kamino.model.Account
import kamino.model.UserProfile
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    @SerialName("auid")
    val aUid: String,
    @SerialName("api:duration")
    val apiDuration: String,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:statuscode")
    val apiStatusCode: Int,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("secret")
    val secret: String?,
    @SerialName("sid")
    val sid: String,
    @SerialName("account")
    val account: Account,
    @SerialName("userProfile")
    val userProfile: UserProfile
)
