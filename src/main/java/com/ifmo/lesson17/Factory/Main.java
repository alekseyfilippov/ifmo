package com.ifmo.lesson17.Factory;

import com.ifmo.lesson2.Factorial;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getFactory("JP");
        factory.createCar();

    }
}
