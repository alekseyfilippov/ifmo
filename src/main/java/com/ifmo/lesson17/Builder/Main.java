package com.ifmo.lesson17.Builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza
                .Builder("Тонкое", "Моцарелла")
                .ketchup(5)
                .pepperoni(7)
                .build();
        System.out.println(pizza);
    }
}
