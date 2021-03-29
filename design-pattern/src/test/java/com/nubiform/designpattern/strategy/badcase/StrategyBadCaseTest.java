package com.nubiform.designpattern.strategy.badcase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyBadCaseTest {
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
        Movable train = new Train();
        Movable bus = new Bus();
        Movable taxi = new Taxi();

        train.move();
        bus.move();
        taxi.move();

        assertEquals("move railroad\n" +
                "move road\n" +
                "move road\n", OUT.toString());
    }
}