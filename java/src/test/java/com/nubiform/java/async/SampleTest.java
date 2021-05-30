package com.nubiform.java.async;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    public void test() throws ExecutionException, InterruptedException {
        Sample sample = new Sample();

        sample.run();

        assertTrue(true);
    }
}