package org.coind.basic_template.service

import org.coind.basic_template.model.CreditCardResponse
import retrofit2.http.GET

interface CreditCardService {

    @GET("credit_cards")
    suspend fun getCreditCards(): CreditCardResponse

}