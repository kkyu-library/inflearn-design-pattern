package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._01_before

class AuthRequestHandler : RequestHandler() {

    override fun handler(request: Request) {
        println("인증이 되었나?")
        println("이 핸들러를 사용할 수 있는 유저인가?")
        super.handler(request)
    }
}
