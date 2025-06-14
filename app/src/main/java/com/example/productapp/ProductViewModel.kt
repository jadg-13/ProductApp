package com.example.productapp

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {
    private val _products = mutableStateListOf<Product>()
    val products: List<Product> = _products

    fun addProduct(name: String, price: Double, stock: Int) {
        _products.add(Product(name, price, stock))
        Log.d("ProductViewModel", "Producto añadido: $name, $price, $stock. Total: ${_products.size}")
    }
}
