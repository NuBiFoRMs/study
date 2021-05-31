package com.nubiform.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class DishTest {

    List<Dish> menu;

    List<String> words;

    String[] arrayOfWorld;

    @BeforeEach
    public void setUp() {
        menu = List.of(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        words = List.of("Hello", "World");

        arrayOfWorld = new String[] {"Goodbye", "World"};
    }

    @Test
    public void test() {
        assertTrue(true);
    }

    @Test
    public void threeHighCaloricDishNames() {
        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());

        collect.forEach(System.out::println);
    }

    @Test
    public void vegetarianDishes() {
        List<Dish> collect = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        collect.forEach(System.out::println);
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