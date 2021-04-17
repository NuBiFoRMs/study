package com.nubiform.designpattern.proxy;

public class ServiceImpl implements Service {
    @Override
    public String runSomething() {
        String returnValue = "runSomething";
        System.out.println(returnValue);
        return returnValue;
    }
}
