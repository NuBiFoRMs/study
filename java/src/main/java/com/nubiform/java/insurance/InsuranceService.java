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

class Insurance {

    private String name;

    public String getName() {
        return name;
    }
}

public class InsuranceService {

    public String getInsuranceNameLegacy(Person person) {
        return "unknown";
    }

    public String getInsuranceName(Person person) {
        return Optional.ofNullable(person)
                .map(Person::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("unknown");
    }

    public static void main(String[] args) {
        InsuranceService service = new InsuranceService();

        System.out.println(service.getInsuranceName(null));
    }
}
