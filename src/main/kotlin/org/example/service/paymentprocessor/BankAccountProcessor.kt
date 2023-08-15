package org.example.service.paymentprocessor

import jakarta.enterprise.context.ApplicationScoped
import org.example.model.PaymentStatus
import org.example.rest.request.PaymentMethod.ACH
import org.example.rest.request.PaymentRequest
import org.jboss.logging.Logger
import java.util.*


@ApplicationScoped
class BankAccountProcessor : IPayment {

    private val logger: Logger = Logger.getLogger(BankAccountProcessor::class.java)

    override fun chargePayment(paymentRequest: PaymentRequest): PaymentStatus {
        logger.debug("Charging payment using bank account for ${paymentRequest.paymentIdentifier}")
        return PaymentStatus(
            paymentId = UUID.randomUUID(),
            message = "Bank account successful charged"
        )
    }

    override fun undoPayment(paymentRequest: PaymentRequest): PaymentStatus {
        logger.debug("Undo payment using bank account for ${paymentRequest.paymentIdentifier}")
        return PaymentStatus(
            paymentId = UUID.randomUUID(),
            message = "Bank account successful credit"
        )
    }

    override fun paymentType() = ACH

}