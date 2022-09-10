package com.example._03_behavioral_patterns._19_observer.kt._03_java

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

fun main() {
    val subject = PropertyChangeExample.Subject()
    val observer = PropertyChangeExample.User()

    subject.addObserver(observer)
    subject.add("자바 PCL 예제 코드")

    subject.removeObserver(observer)
    subject.add("이 메시지는 볼 수 없지..")
}

class PropertyChangeExample {

    internal class User : PropertyChangeListener {
        override fun propertyChange(evt: PropertyChangeEvent) {
            println(evt.newValue)
        }
    }

    internal class Subject {
        var support = PropertyChangeSupport(this)
        fun addObserver(observer: PropertyChangeListener?) {
            support.addPropertyChangeListener(observer)
        }

        fun removeObserver(observer: PropertyChangeListener?) {
            support.removePropertyChangeListener(observer)
        }

        fun add(message: String?) {
            support.firePropertyChange("eventName", null, message)
        }
    }
}
