package com.nubiform.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class DishTest {

    List<Dish> menu;

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
    public void findAny() {
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .map(Dish::getName)
                .ifPresent(System.out::println);
    }
}