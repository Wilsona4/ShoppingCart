package com.example.shoppingcart.data.repository

import com.example.shoppingcart.data.FakeDataSource
import com.example.shoppingcart.data.model.ShoppingCart
import com.example.shoppingcart.domain.repository.CartRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CartRepositoryImpl : CartRepository {

    override fun getShoppingCartItems(): Flow<ShoppingCart> = flow {
        emit(FakeDataSource.shoppingCart)
    }
}