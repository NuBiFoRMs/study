package com.nubiform.designpattern.strategy.badcase;

public class Taxi implements Movable {
    @Override
    public void move() {
        System.out.println("move road");
    }
}
