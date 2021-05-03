package it.polito.group19.lab4.controllers

import it.polito.group19.lab4.domain.Product
import org.reactivestreams.Publisher
import org.reactivestreams.Subscriber
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class HomeController {

    @GetMapping("/", produces = ["application/stream+json"])
    fun testReactiveFunctions(): Flux<Product> {
        return Flux.just(
            Product(3, "Pear", "Fruit", 0.5F, 1),
            Product(1, "Lentils", "Legums", 1F, 1)
        )
            .log()
            .doOnNext { println(it.toString()) }
            .map { Product(it.id, it.name, it.category, it.price + 0.5F, it.quantity) }
    }
}