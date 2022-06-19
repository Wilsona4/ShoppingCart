package com.example.shoppingcart.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingcart.data.model.CartItem
import com.example.shoppingcart.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), CartAdapter.Interaction {
    private val cartViewModel: CartViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    private lateinit var cartAdapter: CartAdapter
    private lateinit var recyclerView: RecyclerView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecyclerView()

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                cartViewModel.uiState.collect {
                    cartAdapter.submitList(it.cartItems)
                    binding.tvSubtotal.text = "Subtotal: $${it.subTotal}"
                }
            }
        }
    }

    private fun setRecyclerView() {
        recyclerView = binding.recyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            cartAdapter = CartAdapter(this@MainActivity)
            adapter = cartAdapter
        }
    }


    override fun onItemSelected(position: Int, item: CartItem) {
        Toast.makeText(this, item.name, Toast.LENGTH_SHORT).show()
    }
}