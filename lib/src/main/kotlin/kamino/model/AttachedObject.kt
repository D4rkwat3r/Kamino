package kamino.model

import kotlinx.serialization.Serializable

@Serializable
data class AttachedObject(
    val objectType: Int?,
    val link: String?,
    val title: String?,
    val content: String?,
    val mediaList: List<MediaObject>?
)
