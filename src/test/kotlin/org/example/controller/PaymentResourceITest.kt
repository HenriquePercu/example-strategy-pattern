package org.example.controller

import io.quarkus.test.junit.QuarkusTest
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.hamcrest.Matchers.*
import org.junit.jupiter.api.Test

@QuarkusTest
class PaymentResourceITest {

    @Test
    fun testHelloEndpoint() {
        Given {
            body(getChargeBody())
            header("Content-Type", "application/json")
        } When {
            post("/charge")
        } Then {
            statusCode(200)
            body("id", notNullValue())
            body("message", equalTo("Credit card successful charged"))
            body("status", `is`(true))
        }

    }


    private fun getChargeBody(): String {
        return """
            {
                "originAccountId" : "ae030117-032a-4b0c-b628-4b3ed69b383a",
                "paymentIdentifier" : "ae030117-032a-4b0c-b628-4b3ed69b383a",
                "amount" : 10,
                "paymentMethod" : "CREDIT_CARD"
            }
            """
    }


}