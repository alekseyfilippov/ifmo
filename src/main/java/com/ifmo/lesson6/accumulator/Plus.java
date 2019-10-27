package com.ifmo.lesson6.accumulator;

public class Plus implements Operation{

    private Operation Plus;

    @Override
    public double calculate(double a, double b) {

        return a + b;
    }
}
