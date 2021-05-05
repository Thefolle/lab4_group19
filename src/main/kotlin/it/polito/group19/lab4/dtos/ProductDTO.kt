package it.polito.group19.lab4.dtos

import it.polito.group19.lab4.domain.Product

data class ProductDTO (
    val id: Long?,
    val name: String,
    val category: String,
    val price: Float,
    val quantity: Long
) {

    fun toEntity() = Product(id, name, category, price, quantity)

}