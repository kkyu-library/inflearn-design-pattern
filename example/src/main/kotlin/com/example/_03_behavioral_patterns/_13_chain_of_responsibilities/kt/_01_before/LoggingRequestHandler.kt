package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before

class LoggingRequestHandler : RequestHandler() {

    override fun handler(request: Request) {
        println("로깅")
        super.handler(request)
    }
}
