package com.example._02_structural_patterns._07_bridge.java._03_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeInSpring {

    public static void main(String[] args) {
//        MailSender mailSender = new JavaMailSenderImpl();

        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
    }
}
