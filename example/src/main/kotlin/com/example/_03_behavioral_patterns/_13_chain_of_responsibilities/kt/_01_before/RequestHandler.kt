package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before

open class RequestHandler {

    open fun handler(request: Request) {
        println(request.body)
    }
}
