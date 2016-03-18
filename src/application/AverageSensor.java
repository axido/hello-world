/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author axido
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : this.sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        int average = 0;
        for (Sensor s : this.sensors) {
            average += s.measure();
        }
        average = average / this.sensors.size();
        this.readings.add(average);
        return average;
    }
    
}
