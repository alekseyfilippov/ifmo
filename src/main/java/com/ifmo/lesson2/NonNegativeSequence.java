package com.ifmo.lesson2;

public class NonNegativeSequence {
    /*
    Создайте программу, выводящую на экран все неотрицательные элементы
    последовательности 90 85 80 75 70 65 60 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int i = 90, b = 90; i > 0 ; i--, b-=5) {
            if (b >= 0) {
                System.out.println(b);
            }
        }
    }
}
