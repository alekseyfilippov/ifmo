package com.ifmo.lesson5.Shapes;

public class Shapes {
    public static void main(String[] args) {

    }

    private static double sum(Shape... shapes) {
        double sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}
