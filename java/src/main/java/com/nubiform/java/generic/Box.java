package com.nubiform.java.generic;

public class Box<T> {

    private T box;

    public T get() {
        return box;
    }

    public void set(T box) {
        this.box = box;
    }
}
