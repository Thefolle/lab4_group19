package it.polito.group19.lab4

import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Configuration
@EnableR2dbcRepositories
class DBConfig: AbstractR2dbcConfiguration() {

    @Bean
    override fun connectionFactory(): ConnectionFactory {
        return ConnectionFactories.get(
            ConnectionFactoryOptions.builder().apply {
                option(ConnectionFactoryOptions.DRIVER, "pool")
                option(ConnectionFactoryOptions.PROTOCOL, "mariadb")
                option(ConnectionFactoryOptions.HOST, "localhost")
                option(ConnectionFactoryOptions.PORT, 3307)
                option(ConnectionFactoryOptions.USER, "root")
                option(ConnectionFactoryOptions.PASSWORD, "admin")
                option(ConnectionFactoryOptions.DATABASE, "warehouse")
            }.build()
        )
    }
}