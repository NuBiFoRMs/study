package com.nubiform.java.functional;

public class Process {

    public static void process(Processor p) {
        System.out.println("before process");
        p.process();
        System.out.println("after process");
    }
}
