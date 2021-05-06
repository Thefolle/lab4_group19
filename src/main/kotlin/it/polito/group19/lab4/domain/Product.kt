package it.polito.group19.lab4.domain

import it.polito.group19.lab4.dtos.ProductDTO
import org.springframework.data.annotation.Id

data class Product(
    @Id val id: Long?,
    val name: String,
    val category: String,
    var price: Float,
    var quantity: Long
){
    fun toDTO() = ProductDTO(
            id = this.id!!,
            name = this.name,
            category = this.category,
            price = this.price,
            quantity = this.quantity
        )
}