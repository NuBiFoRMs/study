package com.nubiform.java.async;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Shop {

    public String getName() {
        return name;
    }

    private final String name;

    private Random random = new Random();

    public Shop() {
        this.name = "Test";
    }

    public Shop(String name) {
        this.name = name;
    }


    public double getPrice(String product) {
        return calculatePrice(product);
    }

    public Future<Double> getPriceAsync(String product) {
        return CompletableFuture
                .supplyAsync(() -> calculatePrice(product));

//        CompletableFuture<Double> completableFuture = new CompletableFuture<>();
//        new Thread(() -> {
//            try {
//                double price = calculatePrice(product);
//                completableFuture.complete(price);
//            } catch (Exception e) {
//                completableFuture.completeExceptionally(e);
//            }
//        }).start();
//        return completableFuture;
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
