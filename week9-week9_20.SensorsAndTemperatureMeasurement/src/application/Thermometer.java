/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author aikitrumm
 */


/*
* Variabe boolean isOn is created
* Method on() puts the value of isOn = true
* Method off() puts the value of isOn = false
*/
public class Thermometer implements Sensor {
    private boolean isOn;
    private int parameter;
    
    public Thermometer() {
        
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        int temperature = 0;
        if (isOn()) {
            temperature = getRandomNumberInRange(-30, 30);
            this.parameter = temperature;
        } else if (!isOn()) {
            throw new IllegalStateException("Off");
        }
        return temperature;
    }

    public int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public int parameter() {
        return this.parameter;
    }
    
}
