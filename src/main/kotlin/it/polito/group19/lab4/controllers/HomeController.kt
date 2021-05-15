package it.polito.group19.lab4.controllers

import it.polito.group19.lab4.domain.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux

@RestController
@RequestMapping(value = ["/junk"])
class HomeController {

    @GetMapping("/", produces = ["application/stream+json"])
    fun testReactiveFunctions(): Flow<Product> {
        return flowOf(Product(3, "Pear", "Fruit", 0.5F, 1),
            Product(1, "Lentils", "Legums", 1F, 1))
            .onStart { delay(600L) }
        /*return Flux.just(
            Product(3, "Pear", "Fruit", 0.5F, 1),
            Product(1, "Lentils", "Legums", 1F, 1)
        )
            .log()
            .doOnNext { println(it.toString()) }
            .map { Product(it.id, it.name, it.category, it.price + 0.5F, it.quantity) }*/
    }

    @GetMapping("/coroutine")
    suspend fun testCoroutine(): Product {
        return Product(3, "Bologna", "cold cuts", 3.5F, 2)
    }

}