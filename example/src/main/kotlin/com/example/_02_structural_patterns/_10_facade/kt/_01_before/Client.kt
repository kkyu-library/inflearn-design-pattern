package com.example._02_structural_patterns._10_facade.kt._01_before

import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

fun main() {
    val to = "keesun@whiteship.me"
    val from = "whiteship@whiteship.me"
    val host = "127.0.0.1"

    val properties = System.getProperties()
    properties.setProperty("mail.smtp.host", host)

    val session = Session.getDefaultInstance(properties)

    try {
        val message = MimeMessage(session)
        message.setFrom(InternetAddress(from))
        message.addRecipient(Message.RecipientType.TO, InternetAddress(to))
        message.subject = "Test Mail from Java Program"
        message.setText("message")

        Transport.send(message)
    } catch (e: MessagingException) {
        e.printStackTrace()
    }
}
