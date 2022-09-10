package com.example._03_behavioral_patterns._19_observer.kt._02_after

import java.util.function.Consumer

class ChatServer(
    private val subscribers: MutableMap<String, MutableList<Subscriber>> = HashMap()
) {
    fun register(subject: String, subscriber: Subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers[subject]?.add(subscriber)
        } else {
            val list: MutableList<Subscriber> = ArrayList()
            list.add(subscriber)
            subscribers[subject] = list
        }
    }

    fun unregister(subject: String, subscriber: Subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers[subject]!!.remove(subscriber)
        }
    }

    fun sendMessage(user: User, subject: String, message: String) {
        if (subscribers.containsKey(subject)) {
            val userMessage = user.name + ": " + message
            subscribers[subject]!!
                .forEach(Consumer { s: Subscriber -> s.handleMessage(userMessage) })
        }
    }
}
