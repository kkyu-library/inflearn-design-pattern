package com.example._01_creational_patterns._05_prototype.kt._02_after

import org.junit.jupiter.api.Test

internal class GithubIssueTest {

    @Test
    fun prototype() {
        val repository = GithubRepository("whiteship", "live-study")

        val githubIssue = GithubIssue(
            repository = repository,
            id = 1,
            title = "1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가."
        )

        val url = githubIssue.url
        println(url)

        val clone = githubIssue.copy()
        println(clone.url)

        repository.user = "Keesun"

        println("clone !== githubIssue : ${clone !== githubIssue}")
        println("clone == githubIssue : ${clone == githubIssue}")
        println("clone.repository === githubIssue.repository : ${clone.repository === githubIssue.repository}")

        println(githubIssue.url)
        println(clone.url)
    }
}
