package com.nubiform.designpattern.strategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {
    public static final ByteArrayOutputStream OUT = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(OUT));
    }

    @AfterEach
    public void restore() {
        System.setOut(System.out);
    }

    @Test
    public void test() {
        Moving train = new Train();
        Moving bus = new Bus();
        Moving taxi = new Taxi();

        train.setMovableStrategy(new RailRoadStrategy());
        bus.setMovableStrategy(new RoadStrategy());
        taxi.setMovableStrategy(new RoadStrategy());

        train.move();
        bus.move();
        taxi.move();

        assertEquals("move railroad\n" +
                "move road\n" +
                "move road\n", OUT.toString());
    }
}