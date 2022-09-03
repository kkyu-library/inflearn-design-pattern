package com.example._03_behavioral_patterns._15_interpreter.kt._03_java

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class App

fun main(args: Array<String>) {
    val app = SpringApplication(App::class.java)
    app.webApplicationType = WebApplicationType.NONE
    app.run(*args)
}
