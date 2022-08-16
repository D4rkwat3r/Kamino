package kamino.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mention(
    @SerialName("uid")
    val uid: String
)
