package com.ifmo.lesson9.generics;

public interface ArithmeticOperation<T extends Number>{
    T apply(T arg1, T arg2);
}
