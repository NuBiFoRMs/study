package com.nubiform.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    private String message;

    private final List<Observer> observers = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }
}
