package com.example._01_creational_patterns._02_factory_method.java._02_after;

public interface ShipFactory {

    Ship createShip();

    /**
     * interface 안에 default 메서드 정의는 자바 1.8 부터 사용가능
     */
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    /**
     * interface 안에 private 메서드 정의는 자바 1.9 부터 사용가능
     */
    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
