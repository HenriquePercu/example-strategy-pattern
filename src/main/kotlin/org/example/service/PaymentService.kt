package org.example.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.example.rest.request.PaymentRequest

@ApplicationScoped
class PaymentService @Inject constructor(

    private val paymentProcessor: PaymentProcessor

) {

    fun chargePayment(paymentRequest: PaymentRequest) : Boolean{
        return paymentProcessor.chargePayment(paymentRequest)
    }

}