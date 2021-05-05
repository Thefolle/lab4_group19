package it.polito.group19.lab4.domain

import org.springframework.data.annotation.Id

data class Product(
    @Id val id: Long?,
    val name: String,
    val category: String,
    var price: Float,
    var quantity: Long
)