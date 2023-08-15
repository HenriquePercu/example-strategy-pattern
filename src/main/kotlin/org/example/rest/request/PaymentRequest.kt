package org.example.rest.request

import java.math.BigDecimal
import java.util.*

data class PaymentRequest(

    val originAccountId : UUID,
    val paymentIdentifier : UUID,
    val amount : BigDecimal,
    val paymentMethod : PaymentMethod

)
