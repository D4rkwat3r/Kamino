package kamino.model.request

import kamino.model.PaymentContext
import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class PaymentRequest(
    @SerialName("paymentContext")
    val paymentContext: PaymentContext,
    @SerialName("timestamp")
    val timestamp: Long = System.currentTimeMillis()
)
