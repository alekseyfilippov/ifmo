package com.ifmo.lesson17.Factory;

public class JPFactory implements CarFactory{




    @Override
    public Car createCar() {
        return new Toyota();
    }
}
