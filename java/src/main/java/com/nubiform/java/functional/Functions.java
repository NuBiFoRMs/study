package com.nubiform.java.functional;

public class Functions<T> {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void process(T t) {
        count++;
        System.out.println(t);
    }
}
