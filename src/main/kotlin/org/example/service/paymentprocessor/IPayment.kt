package org.example.service.paymentprocessor

import org.example.rest.request.PaymentMethod
import org.example.rest.request.PaymentRequest

interface IPayment {

    fun chargePayment(paymentRequest: PaymentRequest) : Boolean// TODO change to a model POJO

    fun undoPayment(paymentRequest: PaymentRequest) : Boolean

    fun paymentType(): PaymentMethod

}