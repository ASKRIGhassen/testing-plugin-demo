package com.mavengurus;

public class Calculator {

    public static int sum(int a, int b){
        return a + b ;
    }

    public static int sub(int a,int b){
        return a - b ;
    }

    public static int multiply(int a,int b){
        return a * b ;
    }

    public static double divide(int a , int b){
        if(b==0) {
            throw new RuntimeException("Division by 0 not allowed");
        }

        return a / b;
    }
}
