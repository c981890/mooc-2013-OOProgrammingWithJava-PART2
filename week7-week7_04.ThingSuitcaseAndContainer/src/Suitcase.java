
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
public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeightLimit;

    public Suitcase(int maxWeightLimit) {
        this.things = new ArrayList<Thing>();
        this.maxWeightLimit = maxWeightLimit;
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing member : this.things) {
            weight += member.getWeight();
        }
        return weight;
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= this.maxWeightLimit) {
            this.things.add(thing);
        }
    }

    public String toString() {
        if (this.things.size() == 0) {
            return "empty (" + totalWeight() + " kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing (" + totalWeight() + " kg)";
        }
        return this.things.size() + " things (" + totalWeight() + " kg)";
    }

    public void printThings() {
        for (Thing member : this.things) {
            System.out.println(member.toString());
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        
        if (!this.things.isEmpty() && this.things.size() > 0) {
            heaviest = this.things.get(0);
        }
        for (Thing member : this.things) {
            if (member.getWeight() > heaviest.getWeight()) {
                heaviest = member;
            }
        }
        return heaviest;
    }
    
    
}
