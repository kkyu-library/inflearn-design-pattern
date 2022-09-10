package com.example._03_behavioral_patterns._19_observer.kt._01_before

class ChatServer(
    private val messages: MutableMap<String, MutableList<String>> = HashMap()
) {
    fun add(subject: String, message: String) {
        if (messages.containsKey(subject)) {
            messages[subject]?.add(message)
        } else {
            val messageList: MutableList<String> = ArrayList()
            messageList.add(message)
            messages[subject] = messageList
        }
    }

    fun getMessage(subject: String): MutableList<String>? {
        return messages[subject]
    }
}
