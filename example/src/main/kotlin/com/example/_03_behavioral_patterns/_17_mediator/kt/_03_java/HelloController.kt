package com.example._03_behavioral_patterns._17_mediator.kt._03_java

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
}
