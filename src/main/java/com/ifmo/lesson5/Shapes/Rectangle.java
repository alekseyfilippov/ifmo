package com.ifmo.lesson5.Shapes;

public class Rectangle extends Shape {
    private double a;
    private double b;


    @Override
    public double area() {
        return a * b;
    }
}
