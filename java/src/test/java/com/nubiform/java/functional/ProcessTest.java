package com.nubiform.java.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {

    Processor processor = () -> System.out.println("my logic");

    @Test
    public void interfaceTest() {
        Process.process(new Processor() {
            @Override
            public void process() {
                System.out.println("my logic");
            }
        });
    }

    @Test
    public void lambdaTest1() {
        Process.process(() -> System.out.println("my logic"));
    }

    @Test
    public void lambdaTest() {
        Process.process(processor);
    }
}