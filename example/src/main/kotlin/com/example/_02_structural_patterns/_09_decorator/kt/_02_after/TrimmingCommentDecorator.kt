package com.example._02_structural_patterns._09_decorator.kt._02_after

class TrimmingCommentDecorator(
    commentService: CommentService
) : CommentDecorator(commentService) {

    override fun addComment(comment: String) {
        super.addComment(trim(comment))
    }

    private fun trim(comment: String): String {
        return comment.replace("...", "")
    }
}
