package com.nubiform.java.constant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumTypeTest {

    @Test
    public void testEnum() {
        System.out.println(EnumType.PAYMENT);
        System.out.println(EnumType.CANCEL);
    }

    @Test
    public void testFinalClass() {
        System.out.println(FinalClassType.PAYMENT);
        System.out.println(FinalClassType.CANCEL);
    }
}