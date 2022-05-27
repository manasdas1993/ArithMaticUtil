package com.example.arithmaticutil;

public class Calculator {
    public static void setOnAddListener(Double a, Double b, AdditionListener listener){
        listener.result(a + b);
    }
}
