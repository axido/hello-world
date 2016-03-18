/*
 * Different kind of sensor that returns a random number between -30 and 30.
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
