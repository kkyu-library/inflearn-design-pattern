package com.example._01_creational_patterns._02_factory_method.java._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }

}
