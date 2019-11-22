package com.ifmo.lesson17.Factory;

public class RusFactory implements CarFactory{
    @Override
    public Car createCar() { return new Lada(); }
}
