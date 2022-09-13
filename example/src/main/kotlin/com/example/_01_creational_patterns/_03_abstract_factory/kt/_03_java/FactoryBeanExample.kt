package com.example._01_creational_patterns._03_abstract_factory.kt._03_java

import com.example._01_creational_patterns._02_factory_method.java._02_after.Ship
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
//        System.out.println(whiteship.getName());

    val applicationContext: ApplicationContext = AnnotationConfigApplicationContext(FactoryBeanConfig::class.java)
    val bean = applicationContext.getBean(
        Ship::class.java
    )

    println(bean)
}
