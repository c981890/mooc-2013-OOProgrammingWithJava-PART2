
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
public class Container {
    
    private int maxWeightLimit;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public int totalWeightOfContainer() {
        int weight = 0;
        for (Suitcase member : this.suitcases) {
            weight += member.totalWeight();
        }
        return weight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeightOfContainer() + suitcase.totalWeight() <= this.maxWeightLimit) {
            this.suitcases.add(suitcase);
        }        
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + totalWeightOfContainer() + " kg)";
    }
    
    public void printThings() {
        for (Suitcase member : this.suitcases) {
            member.printThings();
        }        
    }
}
