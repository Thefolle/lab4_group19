package it.polito.group19.lab4.dtos

data class ProductDTO (
    val id: Long,
    val name: String,
    val category: String,
    val price: Float,
    val quantity: Long
)