package com.ifmo.lesson5.Shapes;

public class Circle extends Oval {
    private double r;

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
