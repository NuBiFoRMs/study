package com.nubiform.java.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void test() {
        Card card = Card.builder()
                .card("1234123412341234")
                .expiration("1234")
                .cvc("123")
                .build();

        System.out.println(card);
    }

}