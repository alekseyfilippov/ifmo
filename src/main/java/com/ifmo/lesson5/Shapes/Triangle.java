package com.ifmo.lesson5.Shapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    @Override
    public double area () {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
