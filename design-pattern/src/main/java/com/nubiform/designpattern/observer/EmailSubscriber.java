package com.nubiform.designpattern.observer;

public class EmailSubscriber implements Observer {
    @Override
    public void update(Subject subject) {
        Publisher publisher = (Publisher) subject;
        System.out.println("E-mail : " + publisher.getMessage());
    }
}
