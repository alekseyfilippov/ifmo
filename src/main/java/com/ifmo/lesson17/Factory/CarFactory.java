package com.ifmo.lesson17.Factory;

public interface CarFactory {
    static CarFactory getFactory(String countryCode) {
        if ("JP".equals(countryCode)) {
            return new JPFactory();
        } else if ("UK".equals(countryCode)) {
            return new UKFactory();
        } else if ("RU".equals(countryCode)) {
            return new RusFactory();
        } else if ("US".equals(countryCode)) {
            return new UsaFactory();
        } else if ("GE".equals(countryCode)) {
            return new GerFactory();
        }

        return null;
    }

    Car createCar();
}
