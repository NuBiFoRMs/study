package com.nubiform.designpattern.observer;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    public static final ByteArrayOutputStream OUT = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(OUT));
    }

    @AfterEach
    public void restore() {
        System.setOut(System.out);
    }

    @Test
    public void test() {
        Publisher publisher = new Publisher();

        SmsSubscriber smsSubscriber = new SmsSubscriber();
        EmailSubscriber emailSubscriber = new EmailSubscriber();

        publisher.addObserver(smsSubscriber);
        publisher.addObserver(emailSubscriber);

        publisher.setMessage("Test Message1");
        publisher.notifyObservers();

        publisher.removeObserver(emailSubscriber);
        publisher.setMessage("Test Message2");
        publisher.notifyObservers();

        assertEquals("SMS : Test Message1\n" +
                "E-mail : Test Message1\n" +
                "SMS : Test Message2\n", OUT.toString());
    }
}