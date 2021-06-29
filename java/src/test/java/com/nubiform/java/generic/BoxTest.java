package com.nubiform.java.generic;

import org.junit.jupiter.api.Test;

class BoxTest {

    @Test
    public void boxTest() {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.set(new Apple());
        orangeBox.set(new Orange());

        Apple apple = appleBox.get();
        Orange orange = orangeBox.get();

        System.out.println(apple);
        System.out.println(orange);
    }

    @Test
    public void legacyBoxTest() {
        LegacyBox appleBox = new LegacyBox();
        LegacyBox orangeBox = new LegacyBox();

        appleBox.set(new Apple());
        orangeBox.set(new Orange());

        Apple apple = (Apple) appleBox.get();
        Orange orange = (Orange) orangeBox.get();

        System.out.println(apple);
        System.out.println(orange);
    }

}