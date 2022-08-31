package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._02_after

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before.Request

class PrintRequestHandler(
    nextHandler: RequestHandler?
) : RequestHandler(nextHandler) {

    override fun handle(request: Request) {
        println(request.body)
        super.handle(request)
    }
}
