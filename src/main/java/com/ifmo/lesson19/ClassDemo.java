package com.ifmo.lesson19;

import java.lang.reflect.*;

public class ClassDemo {
    public static void main(String[] args) {
        try {
            ClassDemo c = new ClassDemo();
            Class cls = c.getClass();

            // returns the array of Field objects
            Field[] fields = cls.getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                System.out.println("Field = " + fields[i].toString());
            }
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }


    public ClassDemo() {
        // no argument constructor
    }

    public ClassDemo(long l, int i) {
        this.l = l;
        this.i = i;
    }

    long l = 77688;
    int i = 3;
}
