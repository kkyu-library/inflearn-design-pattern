package com.example._02_structural_patterns._09_decorator.kt._01_before

class TrimmingCommentService : CommentService() {

    override fun addComment(comment: String) {
        super.addComment(trim(comment))
    }

    private fun trim(comment: String): String {
        return comment.replace("...", "")
    }
}
