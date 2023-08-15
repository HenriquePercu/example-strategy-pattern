package org.example.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.example.rest.request.PaymentRequest
import org.example.rest.response.PaymentResponse

@ApplicationScoped
class PaymentService @Inject constructor(

    private val paymentProcessor: PaymentProcessor

) {

    fun chargePayment(paymentRequest: PaymentRequest): PaymentResponse {
        return try {
            paymentProcessor.chargePayment(paymentRequest).toPaymentResponse(true)
        } catch (e: Exception) {
            paymentProcessor.undoPayment(paymentRequest).toPaymentResponse(false)
        }
    }


}