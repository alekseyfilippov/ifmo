package com.ifmo.lesson2;

public class Progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int i = 1, b = 1000; i <= 9999 ; i++, b+=3) {
            if (b <= 9999) {
                System.out.println(b);
            }

        }
    }
}
