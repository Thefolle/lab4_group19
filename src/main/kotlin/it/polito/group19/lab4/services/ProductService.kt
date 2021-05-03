package it.polito.group19.lab4.services

import it.polito.group19.lab4.dtos.ProductDTO

interface ProductService {

    fun addProduct(productDTO : ProductDTO)

    fun addQuantity(productId: Long, quantity: Long)

    fun getProductById(productId: Long): ProductDTO

    fun getAllProducts(): List<ProductDTO>

    fun getProductsByCategory(category: String): List<ProductDTO>

}