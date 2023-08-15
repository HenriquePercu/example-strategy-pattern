package org.example.rest.response

import java.util.*

data class PaymentResponse(

    val id: UUID,
    val status: Boolean,
    val message: String

)
