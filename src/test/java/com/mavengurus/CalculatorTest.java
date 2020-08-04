package com.mavengurus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        assertEquals(Calculator.sum(2,3),5);
    }

    @Test
    void sub() {
        assertEquals(Calculator.sub(3,1),2);
    }

    @Test
    void multiply() {
        assertEquals(Calculator.multiply(3,2),6);
    }

    @Test
    void divide() {
        assertEquals(Calculator.divide(6,2),3);
    }
}