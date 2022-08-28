package com.example._02_structural_patterns._10_facade.kt._02_after

fun main() {
    val emailSettings = EmailSettings(host = "127.0.0.1")

    val emailSender = EmailSender(emailSettings)

    val emailMessage = EmailMessage(
        from = "keesun",
        to = "whiteship",
        cc = "일남",
        bcc = null,
        subject = "오징어게임",
        text = "밖은 더 지옥이더라고.."
    )

    emailSender.sendEmail(emailMessage)
}
