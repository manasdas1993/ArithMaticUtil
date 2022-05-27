package com.example.arithmaticutil;

public class Calculator {
    public static void setOnAddListener(double a, double b, AdditionListener listener){
        listener.result(a + b);
    }
}
