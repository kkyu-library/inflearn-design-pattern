package com.example._03_behavioral_patterns._15_interpreter.kt._03_java

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service

@Service
class MyService : ApplicationRunner {

    @Value("#{2 + 5}")
    private val value: String? = null

    override fun run(args: ApplicationArguments) {
        println(value)
    }
}
