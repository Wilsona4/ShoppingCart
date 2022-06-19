package com.example.shoppingcart.data.model


data class CartItem(
    val id: Int,
    val name: String,
    val price: Double,
    val dateTime: String,
    val image: String,
    val quantity: Int
)
