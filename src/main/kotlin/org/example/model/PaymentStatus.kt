package org.example.model

import org.example.rest.response.PaymentResponse
import java.util.*

data class PaymentStatus(

    val paymentId : UUID,
    val message: String

) {

    fun toPaymentResponse(status: Boolean) = PaymentResponse(
        id = paymentId,
        message = message,
        status = status
    )

}
