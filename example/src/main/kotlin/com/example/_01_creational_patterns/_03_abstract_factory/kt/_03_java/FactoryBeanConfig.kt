package com.example._01_creational_patterns._03_abstract_factory.kt._03_java

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FactoryBeanConfig {

    @Bean
    fun shipFactory(): ShipFactory {
        return ShipFactory()
    }
}
