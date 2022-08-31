package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before

fun main() {
    val request = Request("무궁화 꽃이 피었습니다.")
    val requestHandler: RequestHandler = LoggingRequestHandler()
    requestHandler.handler(request)
}
