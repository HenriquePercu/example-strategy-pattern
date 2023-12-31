package org.example.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Instance
import jakarta.inject.Inject
import org.example.model.PaymentStatus
import org.example.rest.request.PaymentRequest
import org.example.service.paymentprocessor.IPayment

@ApplicationScoped
class PaymentProcessor @Inject constructor(

    private val paymentProcessors: Instance<IPayment>

) {

    private val processors = paymentProcessors.associateBy { k -> k.paymentType() }

    fun chargePayment(paymentRequest: PaymentRequest): PaymentStatus {
        return processors[paymentRequest.paymentMethod]?.chargePayment(paymentRequest)
            ?: throw IllegalArgumentException("Payment type ${paymentRequest.paymentMethod} not supported")
    }

    fun undoPayment(paymentRequest: PaymentRequest): PaymentStatus {
        return processors[paymentRequest.paymentMethod]?.chargePayment(paymentRequest)
            ?: throw IllegalArgumentException("Payment type ${paymentRequest.paymentMethod} not supported")
    }
}