package com.ifmo.lesson9.generics;

public interface Appendable<T> {
    Appendable append (T o);
    T value();
}
