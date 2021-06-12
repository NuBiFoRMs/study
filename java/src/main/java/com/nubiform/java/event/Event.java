package com.nubiform.java.event;

import java.util.Objects;

public class Event {

    private long eventId;

    private String eventName;

    private String content;

    public Event(long eventId, String eventName, String content) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventId == event.eventId && Objects.equals(eventName, event.eventName) && Objects.equals(content, event.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventName, content);
    }
}
