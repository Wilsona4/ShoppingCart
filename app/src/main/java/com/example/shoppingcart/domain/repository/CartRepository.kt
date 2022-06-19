package com.example.shoppingcart.domain.repository

import com.example.shoppingcart.data.model.CartItem
import com.example.shoppingcart.data.model.ShoppingCart
import kotlinx.coroutines.flow.Flow

interface CartRepository {
    fun getShoppingCartItems(): Flow<ShoppingCart>
}