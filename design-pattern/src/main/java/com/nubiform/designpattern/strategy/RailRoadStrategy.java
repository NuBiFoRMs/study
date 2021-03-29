package com.nubiform.designpattern.strategy;

public class RailRoadStrategy implements MovableStrategy {
    @Override
    public void move() {
        System.out.println("move railroad");
    }
}
