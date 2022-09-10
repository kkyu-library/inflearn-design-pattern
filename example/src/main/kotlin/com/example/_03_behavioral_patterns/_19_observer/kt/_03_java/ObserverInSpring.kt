package com.example._03_behavioral_patterns._19_observer.kt._03_java

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ObserverInSpring

fun main(args: Array<String>) {
    val app = SpringApplication(ObserverInSpring::class.java)
    app.webApplicationType = WebApplicationType.NONE
    app.run(*args)
}
