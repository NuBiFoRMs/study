package com.nubiform.java.event;

interface A {

    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B extends A {

    default void hello() {
        System.out.println("Hello from B");
    }
}

class D implements A {

}

public class C extends D implements B, A {

    public static void main(String[] args) {
        new C().hello();
    }
}
