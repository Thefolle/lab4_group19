package it.polito.group19.lab4.repositories

import it.polito.group19.lab4.domain.Product
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: CoroutineCrudRepository<Product, Long> {
}