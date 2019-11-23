package com.ifmo.lesson18.Observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        MainConsole mainConsole = new MainConsole();
        Sensor70 sensor70 = new Sensor70();
        Sensor110 sensor110 = new Sensor110();
        Sensor130 sensor130 = new Sensor130();

        mainConsole.connect(sensor70);
        mainConsole.connect(sensor110);
        mainConsole.connect(sensor130);

        int temp= 25;
        while (temp <= 135) {
            mainConsole.newTemp(temp);
            temp++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
