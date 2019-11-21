package com.ifmo.lesson17.Factory;

public interface CarFactory {
    static CarFactory getFactory(String countryCode) {
        if ("JP".equals(countryCode)) {
            return new JPFactory();
        }

        return null;
    }

    Car createCar();
}
