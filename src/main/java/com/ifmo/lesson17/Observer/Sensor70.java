package com.ifmo.lesson17.Observer;

public class Sensor70 implements Sensor {
    @Override
    public void setTemp(int temp) {
        if (70 <= temp) {
            System.out.println("Green");
        }
    }
}
