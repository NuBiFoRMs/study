package com.nubiform.designpattern.strategy.badcase;

public class Client {
    public static void main(String... args) {
        Movable train = new Train();
        Movable bus = new Bus();
        Movable taxi = new Taxi();

        train.move();
        bus.move();
        taxi.move();
    }
}
