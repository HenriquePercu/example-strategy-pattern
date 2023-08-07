package org.example.rest.controller

import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON
import org.example.rest.request.PaymentRequest
import org.example.service.PaymentService

@Path("/charge")
class PaymentResource @Inject constructor(

    private val paymentService: PaymentService

){

    @POST
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    fun chargePayment(paymentRequest: PaymentRequest) = paymentService.chargePayment(paymentRequest)
}