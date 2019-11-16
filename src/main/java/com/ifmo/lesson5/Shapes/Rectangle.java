package com.ifmo.lesson5.Shapes;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double aria() {
        return a * b;
    }
}
