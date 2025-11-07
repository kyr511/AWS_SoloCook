package com.example.solocook.model

data class recipeCard1 ( //Enter Ingredients
    val recipe_Image : String,
    val Title : String,
    val explain : String,
    val ingredients : ArrayList<ingredients_item>
)