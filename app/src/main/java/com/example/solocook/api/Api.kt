package com.example.solocook.api

import com.example.solocook.model.budget_item
import retrofit2.http.GET

interface Api {

    @GET("url")
    fun getBudgetIngredients() : List<budget_item>


}