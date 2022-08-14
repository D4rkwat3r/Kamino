package kamino.internal.model

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class PaymentContext(
    @SerialName("transactionId")
    val transactionId: String,
    @SerialName("isAutoRenew")
    val isAutoRenew: Boolean? = null
)
