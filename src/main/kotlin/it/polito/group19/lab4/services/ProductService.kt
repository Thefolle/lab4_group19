package it.polito.group19.lab4.services

import it.polito.group19.lab4.dtos.ProductDTO

interface ProductService {

    suspend fun addProduct(productDTO : ProductDTO): Long

    suspend fun updateQuantity(productId: Long, quantityToAdd: Long)

    fun getProductById(productId: Long): ProductDTO

    fun getAllProducts(): List<ProductDTO>

    fun getProductsByCategory(category: String): List<ProductDTO>

}