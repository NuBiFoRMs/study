package com.nubiform.designpattern.proxy;

public class ServiceProxy implements Service {

    private final Service service;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public String runSomething() {
        System.out.println("before");
        String returnValue = service.runSomething();
        System.out.println("after");
        return returnValue;
    }
}
