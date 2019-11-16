package com.ifmo.lesson6.accumulator;

public class Accumulator {
    private double value;
    private Operation operation;
    private Object Accumulator;

    private Accumulator(double value, Operation operation){
        this.value = value;
        this.operation = operation;
    }
    double getValue(){
        return value;
    }

    public void accumulate(double v) {
        System.out.println(operation.calculate(value, v));
    }
    public static void main(String[] args) {
        Accumulator accumulator1 = new Accumulator(230, new Plus());
        accumulator1.accumulate(500);
        Accumulator accumulator2 = new Accumulator(500, new Multiply());
        accumulator2.accumulate(5);
    }


}
