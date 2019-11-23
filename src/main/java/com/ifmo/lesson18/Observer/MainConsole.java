package com.ifmo.lesson18.Observer;

import java.util.ArrayList;
import java.util.List;

public class MainConsole {
    private List<Sensor> sensors = new ArrayList<>();

    public void connect(Sensor sensor) {
        sensors.add(sensor);
    }

    public void disconnect(Sensor sensor) {
        sensors.remove(sensor);
    }

    public void newTemp(int temp) {
        System.out.println("Temp = " + temp + "C");

        notifySensors(temp);
    }

    private void notifySensors (int temp) {
        for(Sensor sensor : sensors)
            sensor.setTemp(temp);
    }


}
