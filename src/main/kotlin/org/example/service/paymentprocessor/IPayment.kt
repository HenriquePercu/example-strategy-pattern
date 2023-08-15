package org.example.service.paymentprocessor

import org.example.model.PaymentStatus
import org.example.rest.request.PaymentMethod
import org.example.rest.request.PaymentRequest

interface IPayment {

    fun chargePayment(paymentRequest: PaymentRequest) : PaymentStatus

    fun undoPayment(paymentRequest: PaymentRequest) : PaymentStatus

    fun paymentType(): PaymentMethod

}