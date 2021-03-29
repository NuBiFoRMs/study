package com.nubiform.designpattern.strategy.badcase;

public class Train implements Movable {
    @Override
    public void move() {
        System.out.println("move railroad");
    }
}
