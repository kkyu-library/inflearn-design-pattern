package com.example._02_structural_patterns._09_decorator.kt._03_java

import org.springframework.beans.factory.xml.BeanDefinitionDecorator
import org.springframework.http.server.reactive.ServerHttpRequestDecorator
import org.springframework.http.server.reactive.ServerHttpResponseDecorator

fun main() {
    // 빈 설정 데코레이터
    var decorator: BeanDefinitionDecorator

    // 웹플럭스 HTTP 요청 /응답 데코레이터
    var httpRequestDecorator: ServerHttpRequestDecorator
    var httpResponseDecorator: ServerHttpResponseDecorator
}
