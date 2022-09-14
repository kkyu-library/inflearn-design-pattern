package com.example._02_structural_patterns._06_adapter.kt._03_java

import org.springframework.web.servlet.DispatcherServlet
import org.springframework.web.servlet.HandlerAdapter
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter

fun main() {
    val dispatcherServlet = DispatcherServlet()
    val handlerAdapter: HandlerAdapter = RequestMappingHandlerAdapter()
}
