package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._03_java

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
}
