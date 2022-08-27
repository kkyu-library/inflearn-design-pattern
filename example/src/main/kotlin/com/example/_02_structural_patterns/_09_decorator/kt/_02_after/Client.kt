package com.example._02_structural_patterns._09_decorator.kt._02_after

class Client(
    private val commentService: CommentService
) {

    fun writeComment(comment: String) {
        commentService.addComment(comment)
    }
}
