package com.example._01_creational_patterns._02_factory_method.kt._02_after

interface ShipFactory {

    fun createShip(): Ship

    fun orderShip(name: String, email: String): Ship {
        validate(name, email)
        prepareFor(name)
        val ship = createShip()
        sendEmailTo(email, ship)
        return ship
    }

    private fun sendEmailTo(email: String, ship: Ship) {
        println(ship.name + " 다 만들었습니다.")
    }

    private fun validate(name: String, email: String) {
        require(name.isNotBlank()) { "배 이름을 지어주세요." }
        require(email.isNotBlank()) { "연락처를 남겨주세요." }
    }

    private fun prepareFor(name: String) {
        println("$name 만들 준비 중")
    }
}
