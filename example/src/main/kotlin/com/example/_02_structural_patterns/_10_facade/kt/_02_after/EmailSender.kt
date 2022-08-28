package com.example._02_structural_patterns._10_facade.kt._02_after

import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

class EmailSender(
    private val emailSettings: EmailSettings
) {

    fun sendEmail(emailMessage: EmailMessage) {
        val properties = System.getProperties()
        properties.setProperty("mail.smtp.host", emailSettings.host)

        val session = Session.getDefaultInstance(properties)

        try {
            val message = MimeMessage(session)
            message.setFrom(InternetAddress(emailMessage.from))
            message.addRecipient(Message.RecipientType.TO, InternetAddress(emailMessage.to))
            message.addRecipient(Message.RecipientType.CC, InternetAddress(emailMessage.cc))
            message.subject = emailMessage.subject
            message.setText(emailMessage.text)

            Transport.send(message)
        } catch (e: MessagingException) {
            e.printStackTrace()
        }
    }
}
