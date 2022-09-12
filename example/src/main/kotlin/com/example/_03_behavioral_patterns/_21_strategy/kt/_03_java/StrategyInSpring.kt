package com.example._03_behavioral_patterns._21_strategy.kt._03_java

import org.springframework.beans.factory.xml.BeanDefinitionParser
import org.springframework.cache.CacheManager
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.support.FileSystemXmlApplicationContext
import org.springframework.transaction.PlatformTransactionManager

fun main(args: Array<String>) {
    val applicationContext: ApplicationContext = ClassPathXmlApplicationContext()
    val applicationContext1: ApplicationContext = FileSystemXmlApplicationContext()
    val applicationContext2: ApplicationContext = AnnotationConfigApplicationContext()

    var parser: BeanDefinitionParser

    var platformTransactionManager: PlatformTransactionManager

    var cacheManager: CacheManager
}
