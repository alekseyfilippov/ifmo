package com.ifmo.lesson2;

public class Count2 {
    /*
     В городе N есть большой склад на котором существует 50000 различных полок. Для
    удобства работников руководство склада решило заказать для каждой полки табличку с
    номером от 00001 до 50000 в местной типографии, но когда таблички напечатали, оказалось
    что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички, в
    номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо
    перепечатывать. Напишите программу, которая подсчитает сколько всего таких ошибочных
    табличек оказалось в бракованной партии.
     */
    public static void main(String[] args) {
        System.out.println(count2());
    }

    public static int count2() {
        // TODO implement
        // for 1 ... 50000
        // contains2(i) increment :
        return 0;
    }

    private static boolean contains2 (int i) {
        // i = 12345
        // 12345 % 10 == 5;
        // 12345 / 10 == 1234 5 10 = 4
        //12345 / 10 / 10 == 123 % 10 == 3
        // 12345 /10/ 10 / 10 ==12 % 2 ==2
        return true;
    }
}
