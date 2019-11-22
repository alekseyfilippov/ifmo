package com.ifmo.lesson17.Factory;

public class UKFactory implements CarFactory {

    @Override
    public Car createCar() { return new Bentley(); }
}
