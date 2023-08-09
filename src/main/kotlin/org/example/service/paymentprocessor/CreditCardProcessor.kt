package org.example.service.paymentprocessor

import jakarta.enterprise.context.ApplicationScoped
import org.example.rest.request.PaymentMethod
import org.example.rest.request.PaymentMethod.CREDIT_CARD
import org.example.rest.request.PaymentRequest
import org.jboss.logging.Logger

@ApplicationScoped
class CreditCardProcessor : IPayment {

    private val logger: Logger = Logger.getLogger(CreditCardProcessor::class.java)

    override fun chargePayment(paymentRequest: PaymentRequest): Boolean {
        logger.debug("Charging payment using credit card for ${paymentRequest.paymentIdentifier}")
        return true
    }

    override fun undoPayment(paymentRequest: PaymentRequest): Boolean {
        logger.debug("Charging payment using credit card for ${paymentRequest.paymentIdentifier}")
        return true
    }

    override fun paymentType(): PaymentMethod {
        return CREDIT_CARD
    }


}