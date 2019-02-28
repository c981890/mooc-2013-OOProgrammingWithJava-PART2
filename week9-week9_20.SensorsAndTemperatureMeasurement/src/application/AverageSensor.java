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
public class AverageSensor implements Sensor {

    private List<Sensor> allSensors;
    private List<Integer> temperatures;

    public AverageSensor() {
        this.allSensors = new ArrayList<Sensor>();
        this.temperatures = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.allSensors.add(additional);
        // this.isOn = additional.isOn();
    }

    @Override
    public boolean isOn() {
        boolean isOn = true;
        for (Sensor member : this.allSensors) {
            if (!member.isOn()) {
                isOn = false;
            }
        }
        return isOn;
    }

    @Override
    public void on() {
        for (Sensor member : this.allSensors) {
            if (!member.isOn()) {
                member.on();
            }
        }
    }

    @Override
    public void off() {
        for (Sensor member : this.allSensors) {
            if (member.isOn()) {
                member.off();
            }
        }
    }

    @Override
    public int measure() {
        int sumOfTemperatures = 0;
        if (isOn()) {
            for (Sensor member : this.allSensors) {
                int temperature = member.measure();
                sumOfTemperatures += temperature;
            }
        } else if (!isOn() || this.allSensors.isEmpty()) {
            throw new IllegalStateException("Off");
        }
        int average = sumOfTemperatures / this.allSensors.size();
        this.temperatures.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        
        return this.temperatures;
    }
    
}
