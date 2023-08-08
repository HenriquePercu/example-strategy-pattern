package org.example.service.paymentprocessor

import org.example.rest.request.PaymentMethod
import org.example.rest.request.PaymentMethod.CREDIT_CART
import org.example.rest.request.PaymentRequest

class CreditCardProcessor : IPayment {
    override fun chargePayment(paymentRequest: PaymentRequest): Boolean {
        TODO("Not yet implemented")
    }

    override fun undoPayment(paymentRequest: PaymentRequest): Boolean {
        TODO("Not yet implemented")
    }

    override fun paymentType(): PaymentMethod {
        return CREDIT_CART
    }


}