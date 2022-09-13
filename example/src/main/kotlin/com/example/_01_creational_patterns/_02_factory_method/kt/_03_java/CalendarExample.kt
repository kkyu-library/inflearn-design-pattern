package com.example._01_creational_patterns._02_factory_method.kt._03_java

import java.util.*

fun main() {
    println(Calendar.getInstance().javaClass)
    println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).javaClass)
    println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).javaClass)
}
