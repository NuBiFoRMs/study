package com.nubiform.java.async;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static java.util.stream.Collectors.toList;

class ShopsTest {

    Shop shop;

    List<Shop> shops;

    @BeforeEach
    public void setUp() {
        shops = List.of(new Shop("1"),
                new Shop("2"),
                new Shop("3"),
                new Shop("4"),
                new Shop("5"));

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

    @Test
    public void getFindPriceTest() {
        long start = System.nanoTime();

        List<String> collect = findPrices("Test");

        long retrievalTime = (System.nanoTime() - start) / 1000000;
        System.out.println(retrievalTime + " ms");
    }

    @Test
    public void getFindPriceParallelTest() {
        long start = System.nanoTime();

        List<String> collect = findPricesParallel("Test");

        long retrievalTime = (System.nanoTime() - start) / 1000000;
        System.out.println(retrievalTime + " ms");
    }

    @Test
    public void getFindPriceFutureTest() {
        long start = System.nanoTime();

        List<String> collect = findPricesFuture("Test");

        long retrievalTime = (System.nanoTime() - start) / 1000000;
        System.out.println(retrievalTime + " ms");
    }

    private List<String> findPrices(String product) {
        return shops.stream()
                .map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product)))
                .collect(toList());
    }

    private List<String> findPricesParallel(String product) {
        return shops.parallelStream()
                .map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product)))
                .collect(toList());
    }

    private List<String> findPricesFuture(String product) {
        return shops.stream()
                .map(shop -> CompletableFuture
                        .supplyAsync(() -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product))))
                .collect(toList())
                .stream()
                .map(CompletableFuture::join)
                .collect(toList());
    }
}