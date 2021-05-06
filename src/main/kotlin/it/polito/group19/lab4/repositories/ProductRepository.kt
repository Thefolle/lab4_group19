package it.polito.group19.lab4.repositories

import it.polito.group19.lab4.domain.Product
import it.polito.group19.lab4.dtos.ProductDTO
import kotlinx.coroutines.flow.Flow
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: CoroutineCrudRepository<Product, Long> {

    fun findProductsByCategory(category: String): Flow<Product>
}