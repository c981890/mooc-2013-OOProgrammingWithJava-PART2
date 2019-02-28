/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.*;

/**
 *
 * @author aikitrumm
 */
public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> allThings;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.allThings = new ArrayList<Thing>();
    }
    
    public int getVolume() {
        int volume = 0;
        for (Thing member : this.allThings) {
            volume += member.getVolume();
        }
        return volume;
    }
    
    public boolean addThing(Thing thing) {
        if (this.maximumCapacity - getVolume() >= thing.getVolume()) {
            this.allThings.add(thing);
            return true;
        }
        return false;
    }

}
