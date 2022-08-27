package com.example._02_structural_patterns._09_decorator.kt._01_before

class Client(
    private val commentService: CommentService
) {
    fun writeComment(comment: String) {
        commentService.addComment(comment)
    }
}
