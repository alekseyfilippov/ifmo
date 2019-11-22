package com.ifmo.lesson17.Factory;


public class Main {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getFactory("JP");
        factory.createCar();

    }
}
