package com.nubiform.java.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    @Test
    public void test() {
        Functions<String> functions = new Functions<>();

        List.of("1", "2", "3", "4", "5", "6", "7").parallelStream().forEach(functions::process);

        System.out.println(functions.getCount());
    }

}