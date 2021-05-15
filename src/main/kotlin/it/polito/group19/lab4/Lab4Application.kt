package it.polito.group19.lab4

import it.polito.group19.lab4.domain.Product
import it.polito.group19.lab4.repositories.ProductRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Lab4Application {

    @Bean
    fun fillDB(productRepository: ProductRepository): CommandLineRunner {
        return CommandLineRunner {

            val products = mutableListOf<Product>(
                Product(null, "lentils", "Legume", 1.00F, 130),
                Product(null, "Chickpeas", "Legume", 1.3F, 40),
                Product(null, "Pumpkin seeds", "Dried fruit", 2.5F, 40),
                Product(null, "Strawberry", "Fruit", 0.5F, 40),
                Product(null, "Provola", "Cheese", 4.3F, 70),
                Product(null, "Ham", "Cold cuts", 3.2F, 20),
                Product(null, "Coke", "Soda", 2.3F, 90),
                Product(null, "Orange soda", "Soda", 2.5F, 110),
                Product(null, "Cucumber", "Vegetable", 2.0F, 50),
                Product(null, "Blueberry", "Fruit", 4.1F, 30),
                Product(null, "Citron", "Fruit", 2.3F, 40),
                Product(null, "Cherry", "Fruit", 2.4F, 50),
                Product(null, "Mango", "Fruit", 4.5F, 70),
                Product(null, "Persimmon", "Fruit", 3.0F, 50),
                Product(null, "Maple syrup", "Sweetener", 4.2F, 60),
                Product(null, "Black pepper", "Spice", 3.1F, 20),
                Product(null, "Brussels sprout", "Vegetable", 2.4F, 50),
                Product(null, "Spinach", "Vegetable", 2.4F, 70),
                Product(null, "Chicken", "Meat", 2.2F, 50),
                Product(null, "Finger", "Fish", 3.3F, 40),
                Product(null, "Cod", "Fish", 4.2F, 90),
                Product(null, "Swordfish", "Fish", 6.3F, 40),
                Product(null, "Salted cod", "Fish", 5.5F, 60),
                Product(null, "Electric ray", "Fish", 45.9F, 4),
                Product(null, "Peas", "Legume", 2.0F, 90),
                Product(null, "Pear", "Fruit", 2.6F, 100),
                Product(null, "Hake", "Fish", 3.5F, 70),
                Product(null, "Tomato", "Vegetable", 2.4F, 90),
                Product(null, "Pasta", "Pasta", 1.5F, 110),
                Product(null, "Potato", "Vegetable", 2.6F, 100),
                Product(null, "Hemp seed", "Dried fruit", 5.3F, 40),
                Product(null, "Basil", "Herb", 0.4F, 40),
                Product(null, "Parsley", "Herb", 0.3F, 80),
                Product(null, "Sage", "Herb", 1.4F, 70),
                Product(null, "Rosemary", "Herb", 1.3F, 50),
                Product(null, "Mint", "Herb", 1.2F, 90),
                Product(null, "Tomato", "Vegetable", 2.1F, 130),
                Product(null, "Potato", "Vegetable", 2.6F, 90),
                Product(null, "Lettuce", "Vegetable", 1.7F, 70),
                Product(null, "Aubergine", "Vegetable", 1.5F, 120),
                Product(null, "Broad bean", "Legume", 2.3F, 60),
                Product(null, "Thyme", "Herb", 2.1F, 80),
                Product(null, "Oleander", "Herb", 3.6F, 30),
                Product(null, "Wild strawberry", "Fruit", 3.8F, 20),
                Product(null, "lentils", "Legume", 1.00F, 130),
                Product(null, "Chickpeas", "Legume", 1.3F, 40),
                Product(null, "Pumpkin seeds", "Dried fruit", 2.5F, 40),
                Product(null, "Strawberry", "Fruit", 0.5F, 40),
                Product(null, "Provola", "Cheese", 4.3F, 70),
                Product(null, "Ham", "Cold cuts", 3.2F, 20),
                Product(null, "Coke", "Soda", 2.3F, 90),
                Product(null, "Orange soda", "Soda", 2.5F, 110),
                Product(null, "Cucumber", "Vegetable", 2.0F, 50),
                Product(null, "Blueberry", "Fruit", 4.1F, 30),
                Product(null, "Citron", "Fruit", 2.3F, 40),
                Product(null, "Cherry", "Fruit", 2.4F, 50),
                Product(null, "Mango", "Fruit", 4.5F, 70),
                Product(null, "Persimmon", "Fruit", 3.0F, 50),
                Product(null, "Maple syrup", "Sweetener", 4.2F, 60),
                Product(null, "Black pepper", "Spice", 3.1F, 20),
                Product(null, "Brussels sprout", "Vegetable", 2.4F, 50),
                Product(null, "Spinach", "Vegetable", 2.4F, 70),
                Product(null, "Chicken", "Meat", 2.2F, 50),
                Product(null, "Finger", "Fish", 3.3F, 40),
                Product(null, "Cod", "Fish", 4.2F, 90),
                Product(null, "Swordfish", "Fish", 6.3F, 40),
                Product(null, "Salted cod", "Fish", 5.5F, 60),
                Product(null, "Electric ray", "Fish", 45.9F, 4),
                Product(null, "Peas", "Legume", 2.0F, 90),
                Product(null, "Pear", "Fruit", 2.6F, 100),
                Product(null, "Hake", "Fish", 3.5F, 70),
                Product(null, "Tomato", "Vegetable", 2.4F, 90),
                Product(null, "Pasta", "Pasta", 1.5F, 110),
                Product(null, "Potato", "Vegetable", 2.6F, 100),
                Product(null, "Hemp seed", "Dried fruit", 5.3F, 40),
                Product(null, "Basil", "Herb", 0.4F, 40),
                Product(null, "Parsley", "Herb", 0.3F, 80),
                Product(null, "Sage", "Herb", 1.4F, 70),
                Product(null, "Rosemary", "Herb", 1.3F, 50),
                Product(null, "Mint", "Herb", 1.2F, 90),
                Product(null, "Tomato", "Vegetable", 2.1F, 130),
                Product(null, "Potato", "Vegetable", 2.6F, 90),
                Product(null, "Lettuce", "Vegetable", 1.7F, 70),
                Product(null, "Aubergine", "Vegetable", 1.5F, 120),
                Product(null, "Broad bean", "Legume", 2.3F, 60),
                Product(null, "Thyme", "Herb", 2.1F, 80),
                Product(null, "Oleander", "Herb", 3.6F, 30),
                Product(null, "Wild strawberry", "Fruit", 3.8F, 20),
                Product(null, "lentils", "Legume", 1.00F, 130),
                Product(null, "Chickpeas", "Legume", 1.3F, 40),
                Product(null, "Pumpkin seeds", "Dried fruit", 2.5F, 40),
                Product(null, "Strawberry", "Fruit", 0.5F, 40),
                Product(null, "Provola", "Cheese", 4.3F, 70),
                Product(null, "Ham", "Cold cuts", 3.2F, 20),
                Product(null, "Coke", "Soda", 2.3F, 90),
                Product(null, "Orange soda", "Soda", 2.5F, 110),
                Product(null, "Cucumber", "Vegetable", 2.0F, 50),
                Product(null, "Blueberry", "Fruit", 4.1F, 30),
                Product(null, "Citron", "Fruit", 2.3F, 40),
                Product(null, "Cherry", "Fruit", 2.4F, 50),
                Product(null, "Mango", "Fruit", 4.5F, 70),
                Product(null, "Persimmon", "Fruit", 3.0F, 50),
                Product(null, "Maple syrup", "Sweetener", 4.2F, 60),
                Product(null, "Black pepper", "Spice", 3.1F, 20),
                Product(null, "Brussels sprout", "Vegetable", 2.4F, 50),
                Product(null, "Spinach", "Vegetable", 2.4F, 70),
                Product(null, "Chicken", "Meat", 2.2F, 50),
                Product(null, "Finger", "Fish", 3.3F, 40),
                Product(null, "Cod", "Fish", 4.2F, 90),
                Product(null, "Swordfish", "Fish", 6.3F, 40),
                Product(null, "Salted cod", "Fish", 5.5F, 60),
                Product(null, "Electric ray", "Fish", 45.9F, 4),
                Product(null, "Peas", "Legume", 2.0F, 90),
                Product(null, "Pear", "Fruit", 2.6F, 100),
                Product(null, "Hake", "Fish", 3.5F, 70),
                Product(null, "Tomato", "Vegetable", 2.4F, 90),
                Product(null, "Pasta", "Pasta", 1.5F, 110),
                Product(null, "Potato", "Vegetable", 2.6F, 100),
                Product(null, "Hemp seed", "Dried fruit", 5.3F, 40),
                Product(null, "Basil", "Herb", 0.4F, 40),
                Product(null, "Parsley", "Herb", 0.3F, 80),
                Product(null, "Sage", "Herb", 1.4F, 70),
                Product(null, "Rosemary", "Herb", 1.3F, 50),
                Product(null, "Mint", "Herb", 1.2F, 90),
                Product(null, "Tomato", "Vegetable", 2.1F, 130),
                Product(null, "Potato", "Vegetable", 2.6F, 90),
                Product(null, "Lettuce", "Vegetable", 1.7F, 70),
                Product(null, "Aubergine", "Vegetable", 1.5F, 120),
                Product(null, "Broad bean", "Legume", 2.3F, 60),
                Product(null, "Thyme", "Herb", 2.1F, 80),
                Product(null, "Oleander", "Herb", 3.6F, 30),
                Product(null, "Wild strawberry", "Fruit", 3.8F, 20),
                Product(null, "lentils", "Legume", 1.00F, 130),
                Product(null, "Chickpeas", "Legume", 1.3F, 40),
                Product(null, "Pumpkin seeds", "Dried fruit", 2.5F, 40),
                Product(null, "Strawberry", "Fruit", 0.5F, 40),
                Product(null, "Provola", "Cheese", 4.3F, 70),
                Product(null, "Ham", "Cold cuts", 3.2F, 20),
                Product(null, "Coke", "Soda", 2.3F, 90),
                Product(null, "Orange soda", "Soda", 2.5F, 110),
                Product(null, "Cucumber", "Vegetable", 2.0F, 50),
                Product(null, "Blueberry", "Fruit", 4.1F, 30),
                Product(null, "Citron", "Fruit", 2.3F, 40),
                Product(null, "Cherry", "Fruit", 2.4F, 50),
                Product(null, "Mango", "Fruit", 4.5F, 70),
                Product(null, "Persimmon", "Fruit", 3.0F, 50),
                Product(null, "Maple syrup", "Sweetener", 4.2F, 60),
                Product(null, "Black pepper", "Spice", 3.1F, 20),
                Product(null, "Brussels sprout", "Vegetable", 2.4F, 50),
                Product(null, "Spinach", "Vegetable", 2.4F, 70),
                Product(null, "Chicken", "Meat", 2.2F, 50),
                Product(null, "Finger", "Fish", 3.3F, 40),
                Product(null, "Cod", "Fish", 4.2F, 90),
                Product(null, "Swordfish", "Fish", 6.3F, 40),
                Product(null, "Salted cod", "Fish", 5.5F, 60),
                Product(null, "Electric ray", "Fish", 45.9F, 4),
                Product(null, "Peas", "Legume", 2.0F, 90),
                Product(null, "Pear", "Fruit", 2.6F, 100),
                Product(null, "Hake", "Fish", 3.5F, 70),
                Product(null, "Tomato", "Vegetable", 2.4F, 90),
                Product(null, "Pasta", "Pasta", 1.5F, 110),
                Product(null, "Potato", "Vegetable", 2.6F, 100),
                Product(null, "Hemp seed", "Dried fruit", 5.3F, 40),
                Product(null, "Basil", "Herb", 0.4F, 40),
                Product(null, "Parsley", "Herb", 0.3F, 80),
                Product(null, "Sage", "Herb", 1.4F, 70),
                Product(null, "Rosemary", "Herb", 1.3F, 50),
                Product(null, "Mint", "Herb", 1.2F, 90),
                Product(null, "Tomato", "Vegetable", 2.1F, 130),
                Product(null, "Potato", "Vegetable", 2.6F, 90),
                Product(null, "Lettuce", "Vegetable", 1.7F, 70),
                Product(null, "Aubergine", "Vegetable", 1.5F, 120),
                Product(null, "Broad bean", "Legume", 2.3F, 60),
                Product(null, "Thyme", "Herb", 2.1F, 80),
                Product(null, "Oleander", "Herb", 3.6F, 30),
                Product(null, "Wild strawberry", "Fruit", 3.8F, 20)
            )

            val charPool = ('a'..'z') + ('A'..'Z') + ('0'..'9')

            var randomProducts = mutableListOf<Product>()
            var randomName: String
            var randomCategory: String
            for (i in 0..1000L) {
                randomName = (1..20)
                    .map { i -> kotlin.random.Random.nextInt(0, charPool.size) }
                    .map(charPool::get)
                    .joinToString("");
                randomCategory = (1..20)
                    .map { i -> kotlin.random.Random.nextInt(0, charPool.size) }
                    .map(charPool::get)
                    .joinToString("");
                randomProducts.add(Product(
                    i, randomName, randomCategory, kotlin.random.Random.nextFloat(), kotlin.random.Random.nextInt(10, 120).toLong()
                ))
            }

            productRepository.saveAll(randomProducts)

        }
    }

}

fun main(args: Array<String>) {
    runApplication<Lab4Application>(*args)
}
