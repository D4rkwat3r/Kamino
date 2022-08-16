package kamino.model

import kamino.internal.util.MediaObjectSerializer
import kotlinx.serialization.Serializable

@Serializable(with = MediaObjectSerializer::class)
data class MediaObject(
    val type: Int,
    val url: String,
    val identifier: String?
)
