package com.example._01_creational_patterns._02_factory_method.kt._01_before

object ShipFactory {

    fun orderShip(name: String, email: String): Ship {
        var logo = ""
        var color = ""

        // validate
        require(name.isNotBlank()) { "배 이름을 지어주세요." }
        require(email.isNotBlank()) { "연락처를 남겨주세요." }

        prepareFor(name)

        // Customizing for specific name
        if (name.equals("whiteship", ignoreCase = true)) {
            logo = "\uD83D\uDEE5️"
        } else if (name.equals("blackship", ignoreCase = true)) {
            logo = "⚓"
        }

        // coloring
        if (name.equals("whiteship", ignoreCase = true)) {
            color = "whiteship"
        } else if (name.equals("blackship", ignoreCase = true)) {
            color = "black"
        }

        val ship = Ship(
            name = name,
            color = color,
            logo = logo,
        )

        // notify
        sendEmailTo(email, ship)
        return ship
    }

    private fun prepareFor(name: String) {
        println("$name 만들 준비 중")
    }

    private fun sendEmailTo(email: String, ship: Ship) {
        println("send $email")
        println(ship.name + " 다 만들었습니다.")
    }
}
