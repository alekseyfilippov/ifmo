package com.ifmo.lesson6.accumulator;

public class Multiply implements Operation {

    private Operation Multiply;

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
