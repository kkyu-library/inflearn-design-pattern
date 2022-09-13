package com.example._01_creational_patterns._03_abstract_factory.kt._03_java

import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

fun main() {
    val factory = DocumentBuilderFactory.newInstance()
    val builder = factory.newDocumentBuilder()
    val document = builder.parse(File("src/main/resources/config.xml"))
    println(document.documentElement)
}
