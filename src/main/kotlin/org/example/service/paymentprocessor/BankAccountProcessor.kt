package org.example.service.paymentprocessor

import jakarta.enterprise.context.ApplicationScoped
import org.example.rest.request.PaymentMethod
import org.example.rest.request.PaymentMethod.ACH
import org.example.rest.request.PaymentRequest
import org.jboss.logging.Logger


@ApplicationScoped
class BankAccountProcessor : IPayment {

    private val logger: Logger = Logger.getLogger(BankAccountProcessor::class.java)

    override fun chargePayment(paymentRequest: PaymentRequest): Boolean {
        logger.debug("Charging payment using bank account for ${paymentRequest.paymentIdentifier}")
        return true
    }

    override fun undoPayment(paymentRequest: PaymentRequest): Boolean {
        logger.debug("Undo payment using bank account for ${paymentRequest.paymentIdentifier}")
        return true
    }

    override fun paymentType(): PaymentMethod {
        return ACH
    }
}