package com.example._01_creational_patterns._02_factory_method.kt._03_java

import org.springframework.beans.factory.BeanFactory
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val xmlFactory: BeanFactory = ClassPathXmlApplicationContext("config.xml")
    val hello = xmlFactory.getBean("hello", String::class.java)
    println(hello)

    val javaFactory: BeanFactory = AnnotationConfigApplicationContext(Config::class.java)
    val hi = javaFactory.getBean("hello", String::class.java)
    println(hi)
}

