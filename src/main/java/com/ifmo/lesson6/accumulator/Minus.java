package com.ifmo.lesson6.accumulator;

public class Minus implements Operation {

    private Operation Minus;
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
