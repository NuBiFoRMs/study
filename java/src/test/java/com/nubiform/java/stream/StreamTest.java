package com.nubiform.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamTest {

    List<String> words;

    @BeforeEach
    public void setUp() {
        words = List.of("Hello", "World");
    }

    @Test
    public void words() {
        List<String[]> collect1 = words.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());

        List<Stream<String>> collect2 = words.stream()
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(toList());

        List<String> collect = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        collect.forEach(System.out::println);
    }
}