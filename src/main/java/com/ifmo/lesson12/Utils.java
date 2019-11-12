package com.ifmo.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    interface Predicate<T> {
        boolean isValid(T value);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>((list.size()));
        for (T item : list) {
            if (filter.isValid(item))
                result.add(item);
        }

        return result;
    }

    interface Transform<T, R> {
        boolean isValid(T item);
        // Integer.toString (int i);
    }

    public static <T, R> List<T> transmormer(List<T> list, Transform<T,R> transmormer) {
        List<T> result = new ArrayList<>((list.size()));
        for (T item : list) {
            if (transmormer.isValid(item))
                result.add(item);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        List<Integer> even = filter(integers, i -> i % 2 == 0);

        even.forEach(System.out::println);
        System.out.println("==");
    }

}
