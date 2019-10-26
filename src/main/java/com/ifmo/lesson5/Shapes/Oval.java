package com.ifmo.lesson5.Shapes;

public class Oval extends Shape {
    private double r1;
    private double r2;

    @Override
    public double area() {
        return r1 * r2 * Math.PI;
    }
}
