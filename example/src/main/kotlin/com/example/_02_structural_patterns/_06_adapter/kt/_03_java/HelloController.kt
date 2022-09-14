package com.example._02_structural_patterns._06_adapter.kt._03_java

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hi"
    }
}
