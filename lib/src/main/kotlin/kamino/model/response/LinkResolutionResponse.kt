package kamino.model.response


import kamino.model.LinkInfoV2
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinkResolutionResponse(
    @SerialName("api:duration")
    val apiDuration: String,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:statuscode")
    val apiStatusСode: Int,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("linkInfoV2")
    val linkInfoV2: LinkInfoV2
)
