package com.nubiform.java.insurance;

import java.util.Optional;

class Person {
    private Car car;

    public Car getCar() {
        return car;
    }
}

class Car {
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }
}

public class Insurance {

    private String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        String name = Optional.ofNullable(new Person())
                .map(Person::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("unknown");

        System.out.println(name);
    }
}
