package com.ifmo.lesson17.Factory;

public class Toyota implements Car {


    @Override
    public int power() {
        return 50;
    }

    @Override
    public int maxSpeed() {
        return 150;
    }


}
