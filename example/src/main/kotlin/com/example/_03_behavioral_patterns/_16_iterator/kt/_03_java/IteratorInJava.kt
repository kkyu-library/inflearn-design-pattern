package com.example._03_behavioral_patterns._16_iterator.kt._03_java

import com.example._03_behavioral_patterns._16_iterator.kt._02_after.Board
import java.io.FileInputStream
import java.util.*
import javax.xml.namespace.QName
import javax.xml.stream.XMLInputFactory

fun main() {
    val enumeration: Enumeration<*>
    val iterator: Iterator<*>

    val board = Board()
    board.addPost("디자인 패턴 게임")
    board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?")
    board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.")

//        board.getPosts().iterator().forEachRemaining(p -> System.out.println(p.getTitle()));

    // TODO Streaming API for XML(StAX), 이터레이터 기반의 API
    val xmlInputFactory = XMLInputFactory.newInstance()
    val reader = xmlInputFactory.createXMLEventReader(FileInputStream("Book.xml"))

    while (reader.hasNext()) {
        val nextEvent = reader.nextEvent()
        if (nextEvent.isStartElement) {
            val startElement = nextEvent.asStartElement()
            val name = startElement.name
            if (name.localPart == "book") {
                val title = startElement.getAttributeByName(QName("title"))
                println(title.value)
            }
        }
    }
}
