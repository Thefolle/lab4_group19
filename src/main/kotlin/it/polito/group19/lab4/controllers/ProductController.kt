package it.polito.group19.lab4.controllers

import it.polito.group19.lab4.domain.Product
import it.polito.group19.lab4.dtos.ProductDTO
import it.polito.group19.lab4.repositories.ProductRepository
import it.polito.group19.lab4.services.ProductService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.withContext
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/warehouse")
class ProductController(val productService: ProductService, val productRepository: ProductRepository) {

    @PostMapping("/products")
    suspend fun addProduct(@RequestBody productDTO: ProductDTO): ResponseEntity<Long> {
        val id = productService.addProduct(productDTO)

        return ResponseEntity<Long>(id, HttpStatus.OK)
    }

    @PatchMapping("/products/{productId}")
    suspend fun updateQuantity(
        @PathVariable("productId") productId: Long,
        @RequestBody quantityToAdd: Long
    ): ResponseEntity<Nothing> {
        productService.updateQuantity(productId, quantityToAdd)

        return ResponseEntity(HttpStatus.OK)
    }

    @GetMapping("/products/{productId}")
    suspend fun getProductById(@PathVariable("productId") productId: Long): ResponseEntity<ProductDTO> {
        val product = productService.getProductById(productId)

        return ResponseEntity<ProductDTO>(product, HttpStatus.FOUND)
    }

    @GetMapping("/products")
    suspend fun getAllProducts(): Flow<ProductDTO> {
        return productService.getAllProducts()
    }

    @GetMapping("/productsByCategory")
    suspend fun getProductsByCategory(@RequestParam("category") category: String): ResponseEntity<List<ProductDTO>> {
        val products = productService.getProductsByCategory(category)

        return ResponseEntity<List<ProductDTO>>(products, HttpStatus.OK)
    }
}