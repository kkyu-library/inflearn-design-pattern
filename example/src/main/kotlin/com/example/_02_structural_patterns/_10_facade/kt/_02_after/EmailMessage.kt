package com.example._02_structural_patterns._10_facade.kt._02_after

class EmailMessage(
    val from: String,
    val to: String,
    val cc: String,
    val bcc: String?,
    val subject: String,
    val text: String,
)
