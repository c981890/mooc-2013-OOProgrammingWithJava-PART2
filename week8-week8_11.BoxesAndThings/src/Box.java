
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aikitrumm
 */
public class Box implements ToBeStored {

    private ArrayList<ToBeStored> things;
    private double maxWeight;

    public Box(double maxWeight) {
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored thing) {
        if (thing.weight() < this.maxWeight - weight()) {
            this.things.add(thing);
        }     
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored member : this.things) {
            weight += member.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + weight() + " kg"; 
    }
    
    

}
