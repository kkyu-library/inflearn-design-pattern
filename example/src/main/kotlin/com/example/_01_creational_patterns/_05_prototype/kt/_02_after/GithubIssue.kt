package com.example._01_creational_patterns._05_prototype.kt._02_after

data class GithubIssue(
    val repository: GithubRepository,
    val id: Int,
    val title: String,
) {
    val url: String
        get() = String.format("https://github.com/%s/%s/issues/%d", repository.user, repository.name, id)

    /**
     * default copy() shadow copy
     * 따라서, copy()를 구현하여 deep copy 으로 변경
     */
    fun copy(): GithubIssue {
        val repository = GithubRepository(this.repository.user, this.repository.name)
        return GithubIssue(repository, id, title)
    }
}
