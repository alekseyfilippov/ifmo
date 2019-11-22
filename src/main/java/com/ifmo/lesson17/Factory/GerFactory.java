package com.ifmo.lesson17.Factory;

public class GerFactory implements CarFactory{
    @Override
    public Car createCar() { return new BMW(); }
}
