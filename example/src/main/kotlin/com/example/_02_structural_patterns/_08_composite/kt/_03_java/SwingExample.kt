package com.example._02_structural_patterns._08_composite.kt._03_java

import java.awt.event.ActionEvent
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField

fun main() {
    val frame = JFrame()

    val textField = JTextField()
    textField.setBounds(200, 200, 200, 40)
    frame.add(textField)

    val button = JButton("click")
    button.setBounds(200, 100, 60, 40)
    button.addActionListener { e: ActionEvent? -> textField.text = "Hello Swing" }
    frame.add(button)

    frame.setSize(600, 400)
    frame.layout = null
    frame.isVisible = true
}
