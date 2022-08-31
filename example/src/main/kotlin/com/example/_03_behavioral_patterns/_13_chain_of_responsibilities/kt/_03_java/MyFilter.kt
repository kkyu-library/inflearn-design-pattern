package com.example._03_behavioral_patterns._13_chain_of_responsibilities.kt._03_java

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.annotation.WebFilter

@WebFilter(urlPatterns = ["/hello"])
class MyFilter : Filter {

    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        println("게임에 참하신 여러분 모두 진심으로 환영합니다.")
        chain.doFilter(request, response)
        println("꽝!")
    }
}
