package com.example.shoppingcart.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppingcart.data.model.ShoppingCart
import com.example.shoppingcart.domain.repository.CartRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(
    private val cartRepository: CartRepository
) : ViewModel() {

    // UI state exposed to the UI
    private val _uiState = MutableStateFlow(ShoppingCart(cartItems = emptyList(), subTotal = 0.0))
    val uiState: StateFlow<ShoppingCart> = _uiState.asStateFlow()

    init {
        getCartItems()
    }

    private fun getCartItems() {
        viewModelScope.launch {
            cartRepository.getShoppingCartItems().collect { shoppingCart ->
                _uiState.update {
                    it.copy(
                        cartItems = shoppingCart.cartItems,
                        subTotal = shoppingCart.subTotal
                    )
                }
            }
        }
    }
}