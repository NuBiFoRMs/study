package com.nubiform.java.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProcessListTest {

    @Test
    public void test1() {
        ProcessList.forEach(List.of("test", "test"), System.out::println);
    }

    @Test
    public void test2() {
        ProcessList.convert(List.of("1", "2"), Integer::parseInt);
    }
}