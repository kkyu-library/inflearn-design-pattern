package com.example._03_behavioral_patterns._19_observer.kt._01_before

class User(
    private val chatServer: ChatServer
) {

    fun sendMessage(subject: String, message: String) {
        chatServer.add(subject, message)
    }

    fun getMessage(subject: String): List<String>? {
        return chatServer.getMessage(subject)
    }
}
