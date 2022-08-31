package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._02_after

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before.Request

class LoggingRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {

    override fun handle(request: Request) {
        println("로깅")
        super.handle(request)
    }
}
