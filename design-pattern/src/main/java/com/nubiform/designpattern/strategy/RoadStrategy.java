package com.nubiform.designpattern.strategy;

public class RoadStrategy implements MovableStrategy {
    @Override
    public void move() {
        System.out.println("move road");
    }
}
