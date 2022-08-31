package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._03_java

import com.example.ExampleApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@ServletComponentScan
@SpringBootApplication
class App

fun main(args: Array<String>) {
    runApplication<ExampleApplication>(*args)
}
