package org.example.service.paymentprocessor

import jakarta.enterprise.context.ApplicationScoped
import org.example.model.PaymentStatus
import org.example.rest.request.PaymentMethod.CREDIT_CARD
import org.example.rest.request.PaymentRequest
import org.jboss.logging.Logger
import java.util.*

@ApplicationScoped
class CreditCardProcessor : IPayment {

    private val logger: Logger = Logger.getLogger(CreditCardProcessor::class.java)

    override fun chargePayment(paymentRequest: PaymentRequest): PaymentStatus {
        logger.debug("Charging payment using credit card for ${paymentRequest.paymentIdentifier}")
        return PaymentStatus(
            paymentId = UUID.randomUUID(),
            message = "Credit card successful charged"
        )
    }

    override fun undoPayment(paymentRequest: PaymentRequest): PaymentStatus {
        logger.debug("Undo payment using credit card for ${paymentRequest.paymentIdentifier}")
        return PaymentStatus(
            paymentId = UUID.randomUUID(),
            message = "Credit card successful credit"
        )
    }

    override fun paymentType() = CREDIT_CARD


}