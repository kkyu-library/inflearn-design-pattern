package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._02_after

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before.Request

class Client(
    private val requestHandler: RequestHandler
) {

    fun doWork() {
        val request = Request("이번 놀이는 뽑기입니다.")
        requestHandler.handle(request)
    }
}

fun main() {
    val chain: RequestHandler = AuthRequestHandler(LoggingRequestHandler(PrintRequestHandler(null)))
    val client = Client(chain)
    client.doWork()
}
