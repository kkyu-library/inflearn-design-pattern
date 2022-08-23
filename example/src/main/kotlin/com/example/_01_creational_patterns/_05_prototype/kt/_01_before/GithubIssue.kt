package com.example._01_creational_patterns._05_prototype.kt._01_before

class GithubIssue(
    private val repository: GithubRepository,
    val id: Int,
    val title: String
) {
    val url: String
        get() = String.format("https://github.com/%s/%s/issues/%d", repository.user, repository.name, id)
}
