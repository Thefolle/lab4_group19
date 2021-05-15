package it.polito.group19.lab4.services

import it.polito.group19.lab4.dtos.ProductDTO
import kotlinx.coroutines.flow.Flow
import reactor.core.publisher.Flux

interface ProductService {

    suspend fun addProduct(productDTO : ProductDTO): Long

    suspend fun updateQuantity(productId: Long, quantityToAdd: Long)

    suspend fun getProductById(productId: Long): ProductDTO

    suspend fun getAllProducts(): Flow<ProductDTO>

    suspend fun getProductsByCategory(category: String): List<ProductDTO>

}