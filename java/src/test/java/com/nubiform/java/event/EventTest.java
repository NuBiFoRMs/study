package com.nubiform.java.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    @Test
    public void test() {
        Event event1 = new Event(1, "event1", "test");
        Event event2 = new Event(1, "event1", "test");

        assertEquals(event1, event2);
        assertTrue(event1.equals(event2));
        assertTrue(event2.equals(event1));
    }
}