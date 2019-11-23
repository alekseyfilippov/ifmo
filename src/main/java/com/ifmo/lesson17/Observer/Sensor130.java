package com.ifmo.lesson17.Observer;

public class Sensor130 implements Sensor {
    @Override
    public void setTemp(int temp) {
        if (130 <= temp) {
            System.out.println("Red");
        }
    }
}
