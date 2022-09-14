package com.example._02_structural_patterns._07_bridge.kt._03_java

import org.springframework.jdbc.support.JdbcTransactionManager
import org.springframework.transaction.PlatformTransactionManager

fun main() {
//        MailSender mailSender = new JavaMailSenderImpl();
    val platformTransactionManager: PlatformTransactionManager = JdbcTransactionManager()
}
