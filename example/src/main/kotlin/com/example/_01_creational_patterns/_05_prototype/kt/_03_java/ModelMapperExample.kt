package com.example._01_creational_patterns._05_prototype.kt._03_java

import com.example._01_creational_patterns._05_prototype.java._02_after.GithubIssue
import com.example._01_creational_patterns._05_prototype.java._02_after.GithubRepository

fun main() {
    val repository = GithubRepository()
    repository.user = "whiteship"
    repository.name = "live-study"

    val githubIssue = GithubIssue(repository)
    githubIssue.id = 1
    githubIssue.title = "1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가."

//        ModelMapper modelMapper = new ModelMapper();
//        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
//        System.out.println(githubIssueData);
}

