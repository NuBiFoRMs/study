package com.nubiform.java.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Sample {

    public void run() throws ExecutionException, InterruptedException {
        System.out.println("call getIntegerFuture");
        Future<Integer> integerFuture = getIntegerFuture();
        System.out.println("return getIntegerFuture");

        System.out.println("integerFuture.get()");
        System.out.println(integerFuture.get());
    }

    public Future<Integer> getIntegerFuture() {
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            System.out.println("start thread");

            int returnValue = 50;
            completableFuture.complete(returnValue);

            System.out.println("end thread");
        }).start();

        return completableFuture;
    }
}
