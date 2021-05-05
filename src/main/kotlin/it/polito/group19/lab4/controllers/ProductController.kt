package it.polito.group19.lab4.controllers

import it.polito.group19.lab4.dtos.ProductDTO
import it.polito.group19.lab4.services.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/products")
class ProductController(val productService: ProductService) {

    @PostMapping("")
    suspend fun addProduct(@RequestBody productDTO: ProductDTO): ResponseEntity<Long> {
        val id = productService.addProduct(productDTO)

        return ResponseEntity<Long>(id, HttpStatus.OK)
    }

    @PatchMapping("/{productId}")
    suspend fun updateQuantity(@PathVariable("productId") productId: Long, @RequestBody quantityToAdd: Long): ResponseEntity<Nothing> {
        productService.updateQuantity(productId, quantityToAdd)

        return ResponseEntity(HttpStatus.OK)
    }

}