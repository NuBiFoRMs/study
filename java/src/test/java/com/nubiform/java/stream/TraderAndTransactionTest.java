package com.nubiform.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TraderAndTransactionTest {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions;

    @BeforeEach
    public void setUp() {
        transactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    @Test
    public void test() {
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====");

        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=====");

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====");

        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====");

        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("=====");

        Integer maxValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(maxValue);

        System.out.println("=====");

        Integer minValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(minValue);
    }
}