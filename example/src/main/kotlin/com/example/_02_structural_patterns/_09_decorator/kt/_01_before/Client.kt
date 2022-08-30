package com.example._02_structural_patterns._09_decorator.kt._01_before

class Client(
    private val commentService: CommentService
) {
    fun writeComment(comment: String) {
        commentService.addComment(comment)
    }
}

fun main() {
    val client = Client(SpamFilteringCommentService())
    client.writeComment("오징어게임")
    client.writeComment("보는게 하는거 보다 재밌을 수가 없지...")
    client.writeComment("http://whiteship.me")

    val client1 = Client(TrimmingCommentService())
    client1.writeComment("오징어게임")
    client1.writeComment("보는게 하는거 보다 재밌을 수가 없지...")
    client1.writeComment("http://whiteship.me")
}
