package com.example._02_structural_patterns._09_decorator.kt._03_java

import java.util.*
import javax.servlet.http.HttpServletRequestWrapper
import javax.servlet.http.HttpServletResponseWrapper

fun main() {
    // Collections가 제공하는 데코레이터 메소드
    val list = arrayListOf<Any>()
    list.add(Book())

//    val books = Collections.checkedList(list, Book::class.java)

//        books.add(new Item());
    val unmodifiableList = Collections.unmodifiableList(list)
    list.add(Item())
    unmodifiableList.add(Book())

    // 서블릿 요청 또는 응답 랩퍼
    var requestWrapper: HttpServletRequestWrapper
    var responseWrapper: HttpServletResponseWrapper
}

private class Book
private class Item
