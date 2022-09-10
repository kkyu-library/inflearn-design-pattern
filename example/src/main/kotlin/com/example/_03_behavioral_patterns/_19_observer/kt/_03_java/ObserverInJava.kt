package com.example._03_behavioral_patterns._19_observer.kt._03_java

import java.util.*

fun main() {
    val subject = ObserverInJava.Subject()
    val user = ObserverInJava.User()
    subject.addObserver(user)
    subject.add("Hello Java, Observer")
}

class ObserverInJava {

    internal class User : Observer {
        override fun update(o: Observable, arg: Any) {
            println(arg)
        }
    }

    internal class Subject : Observable() {
        fun add(message: String?) {
            setChanged()
            notifyObservers(message)
        }
    }
}
