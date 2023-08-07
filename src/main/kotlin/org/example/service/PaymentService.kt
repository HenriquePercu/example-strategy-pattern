package org.example.service

import jakarta.enterprise.context.ApplicationScoped
import org.example.rest.request.PaymentRequest

@ApplicationScoped
class PaymentService {

    fun chargePayment(paymentRequest: PaymentRequest) {
        print("Processing")
    }

}