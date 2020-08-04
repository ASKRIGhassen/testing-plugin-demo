package com.mavengurus;



public class CalculatorTest {


    public void testSum() {
        assert(Calculator.sum(2,3)==5);
    }


    public void testSub() {
       assert(Calculator.sub(3,1)==2);
    }


    public void testMultiply() {
        assert(Calculator.multiply(3,2)==6);

    }


    public void testDivide() {
        assert(Calculator.divide(6,2)==3);
    }
}