package com.example._03_behavioral_patterns._19_observer.kt._02_after

class User(
    val name: String
) : Subscriber {

    override fun handleMessage(message: String) {
        println(message)
    }
}
