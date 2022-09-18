package com.example._03_behavioral_patterns._22_template.java._02_after2;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt") ;
        int result = fileProcessor.process((result1, number) -> result1 + number);
        System.out.println(result);
    }
}
