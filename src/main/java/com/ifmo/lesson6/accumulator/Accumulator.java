package com.ifmo.lesson6.accumulator;

public class Accumulator {
    double value;
    Operation op;

    Accumulator(double value, Operation op) {
        this.value = value;
        this.op = op;
    }

    public double accumulate(double val) {
        value = op.calculate(value, val);
        return value;
    }

    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator(15.1, new Plus());
        accumulator.accumulate(16.2);
        System.out.println(accumulator.value);

        Accumulator accumulator2 = new Accumulator(15.1, new Minus());
        accumulator2.accumulate(13.1);
        System.out.println(accumulator2.value);

        Accumulator accumulator3 = new Accumulator(15.6, new Divide());
        accumulator3.accumulate(5.2);
        System.out.println(accumulator3.value);

        Accumulator accumulator4 = new Accumulator(5.5, new Multiply());
        accumulator4.accumulate(3.0);
        System.out.println(accumulator4.value);

    }


}
