package com.ifmo.lesson17.Observer;

public class Sensor110 implements Sensor {
    @Override
    public void setTemp(int temp) {
        if (110 <= temp) {
            System.out.println("Yellow");
        }
    }
}
