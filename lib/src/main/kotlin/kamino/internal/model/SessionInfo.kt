package kamino.internal.model

data class SessionInfo(
    val secret: String,
    val sid: String,
    val account: Account,
    val userProfile: UserProfile
)
