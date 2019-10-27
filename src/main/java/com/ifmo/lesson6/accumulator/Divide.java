package com.ifmo.lesson6.accumulator;

public class Divide implements Operation {

    private Operation Divide;
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
