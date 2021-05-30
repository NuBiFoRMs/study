package com.nubiform.java.async;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class ShopTest {

    Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void getPriceTest() {
        long start = System.nanoTime();
        double price = shop.getPrice("Test");
        long invocationTime = (System.nanoTime() - start) / 1000000;
        System.out.println(invocationTime + " ms");

        System.out.println(price);
    }

    @Test
    public void getPriceAsyncTest() throws ExecutionException, InterruptedException {
        long start = System.nanoTime();
        Future<Double> price = shop.getPriceAsync("Test");
        long invocationTime = (System.nanoTime() - start) / 1000000;
        System.out.println(invocationTime + " ms");

        System.out.println(price.get());
        long retrievalTime = (System.nanoTime() - start) / 1000000;
        System.out.println(retrievalTime + " ms");
    }

}