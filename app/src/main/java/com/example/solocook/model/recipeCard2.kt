package com.example.solocook.model

data class recipeCard2  ( //Bueget Recipe
    val recipe_Image : String,
    val Title : String,
    val explain : String,
    val ingredients : ArrayList<budget_item>
)