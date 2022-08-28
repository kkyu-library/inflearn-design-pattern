package com.example._02_structural_patterns._10_facade.kt._03_java

import org.springframework.jdbc.support.JdbcTransactionManager
import org.springframework.mail.MailSender
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.transaction.PlatformTransactionManager

fun main(args: Array<String>) {
    val mailSender: MailSender = JavaMailSenderImpl()
    val platformTransactionManager: PlatformTransactionManager = JdbcTransactionManager()
}
