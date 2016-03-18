/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author axido
 */
public class Thermometer implements Sensor{
    private boolean state = false;
    
    public Thermometer() {
        
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        Random rng = new Random();
        if (isOn()) {
            return -30 + (rng.nextInt(60) + 1);
        } else {
            throw new IllegalStateException();
        }
    }
    
}
