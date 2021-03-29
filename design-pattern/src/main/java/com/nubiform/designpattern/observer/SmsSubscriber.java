package com.nubiform.designpattern.observer;

public class SmsSubscriber implements Observer {
    @Override
    public void update(Subject subject) {
        Publisher publisher = (Publisher) subject;
        System.out.println("SMS : " + publisher.getMessage());
    }
}
