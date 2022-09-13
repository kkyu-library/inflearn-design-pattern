package com.example._01_creational_patterns._02_factory_method.kt._03_java

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {

    @Bean
    fun hello(): String {
        return "hello"
    }
}
