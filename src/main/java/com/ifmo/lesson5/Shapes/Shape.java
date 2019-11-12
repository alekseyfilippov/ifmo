package com.ifmo.lesson5.Shapes;

import com.ifmo.lesson4.LinkedList;

public class Shape {
    public Shape(){

    }
    public double area(){
        return 0;
    }
    private static double sum(LinkedList shapes){
        if (shapes==null){
            return 0;
        }
        double sumArea=0;
        /*int i=0;
        while(shapes.get(i)!=null){
            sumArea+=shapes.get(i);
            i++;
        }*/
        return sumArea;
    }
}
