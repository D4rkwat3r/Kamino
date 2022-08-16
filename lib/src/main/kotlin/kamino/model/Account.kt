package kamino.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Account(
    @SerialName("activation")
    val activation: Int,
    @SerialName("advancedSettings")
    val advancedSettings: AdvancedSettings,
    @SerialName("aminoId")
    val aminoId: String,
    @SerialName("aminoIdEditable")
    val aminoIdEditable: Boolean,
    @SerialName("appleID")
    val appleID: String?,
    @SerialName("createdTime")
    val createdTime: String,
    @SerialName("email")
    val email: String,
    @SerialName("emailActivation")
    val emailActivation: Int,
    @SerialName("facebookID")
    val facebookID: String?,
    @SerialName("googleID")
    val googleID: String?,
    @SerialName("icon")
    val icon: String?,
    @SerialName("modifiedTime")
    val modifiedTime: String,
    @SerialName("nickname")
    val nickname: String,
    @SerialName("phoneNumber")
    val phoneNumber: String?,
    @SerialName("phoneNumberActivation")
    val phoneNumberActivation: Int,
    @SerialName("role")
    val role: Int,
    @SerialName("securityLevel")
    val securityLevel: Int,
    @SerialName("status")
    val status: Int,
    @SerialName("twitterID")
    val twitterID: String?,
    @SerialName("uid")
    val uid: String,
    @SerialName("username")
    val username: String?
) {
    @Serializable
    data class AdvancedSettings(
        @SerialName("analyticsEnabled")
        val analyticsEnabled: Int
    )
}
