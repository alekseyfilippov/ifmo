package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        TwoArrays ta = new TwoArrays();

        int[] randomNumbers1 = ta.randomNumbers();
        int[] randomNumbers2 = ta.randomNumbers();

        // TODO implement
        for(int i:randomNumbers1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:randomNumbers2){
            System.out.print(i+" ");
        }

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);

        // TODO implement
        if(average1>average2){
            System.out.println("Среднее арифмитическое массива randomNumbers1 больше");
        }else if (average1<average2) {
            System.out.println("Среднее арифмитическое массива randomNumbers2 больше");
        }else {
            System.out.println("Средние арифмитические равны");
        }
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random random=new Random();
        int [] array=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }
        return array;

    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int result=0;
        for(int i:randomNumbers){
            result+=i;
        }
        return result/randomNumbers.length;

    }
}
