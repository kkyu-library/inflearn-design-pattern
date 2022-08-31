package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._02_after

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before.Request

abstract class RequestHandler(
    private val nextHandler: RequestHandler?
) {
    open fun handle(request: Request) {
        nextHandler?.handle(request)
    }
}
