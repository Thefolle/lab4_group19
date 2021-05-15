package it.polito.group19.lab4.services

import it.polito.group19.lab4.dtos.ProductDTO
import it.polito.group19.lab4.repositories.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ProductServiceImpl(val productRepository: ProductRepository): ProductService {

    override suspend fun addProduct(productDTO: ProductDTO): Long {
        return productRepository.save(productDTO.toEntity()).pid!!
    }

    override suspend fun updateQuantity(productId: Long, quantityToAdd: Long) {
        var product = productRepository.findById(productId) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "The product with id $productId doesn't exist.")
        if (product.quantity + quantityToAdd < 0) throw ResponseStatusException(HttpStatus.FORBIDDEN, "The warehouse has less products than $quantityToAdd.")
        product.quantity += quantityToAdd

        productRepository.save(product)
    }

    override suspend fun getProductById(productId: Long): ProductDTO {
        val product = productRepository.findById(productId) ?: throw ResponseStatusException(
                                                        HttpStatus.NOT_FOUND,
                                                        "The product with id $productId doesn't exist..."
                                                    )
        return product.toDTO()
    }

    override suspend fun getAllProducts(): Flow<ProductDTO> {
        return productRepository.findAll().map { it.toDTO() }
    }

    override suspend fun getProductsByCategory(category: String): List<ProductDTO> {
        return productRepository.findProductsByCategory(category)
                                .map { it.toDTO() }
                                .toList()
    }
}