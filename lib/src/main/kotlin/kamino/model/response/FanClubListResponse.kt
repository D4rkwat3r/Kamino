package kamino.model.response


import kamino.model.FanClub
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FanClubListResponse(
    @SerialName("api:duration")
    val apiDuration: String,
    @SerialName("api:message")
    val apiMessage: String,
    @SerialName("api:statuscode")
    val apiStatusCode: Int,
    @SerialName("api:timestamp")
    val apiTimestamp: String,
    @SerialName("fanClubList")
    val fanClubList: List<FanClub>
)
