package org.coind.basic_template.data

import org.coind.basic_template.model.CreditCardResponse
import org.coind.basic_template.service.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards() :CreditCardResponse {
        return creditCardService.getCreditCards()
    }

}