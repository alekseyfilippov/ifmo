package com.ifmo.lesson17.Factory;

public class UsaFactory implements CarFactory{
    @Override
    public Car createCar() { return new Chrysler(); }
}
