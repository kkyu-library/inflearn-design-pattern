package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._03_java

import javax.servlet.Filter

fun main() {
    val filter = Filter { request, response, chain ->
        // TODO 전처리
        chain.doFilter(request, response)
        // TODO 후처리
    }
}
