/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.*;
import moving.domain.*;

/**
 *
 * @author aikitrumm
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;

    }
    
    /*
     * Function takes as parameter list of things and puts them into
     * boxes.
     * Create list of boxes.
     * Create a new box.
     * Take parameter and go through it thing by thing.
     * If thing goes into box, take next thing.
     * Else add full box into list of boxes.
     * Create new box.
     * Add thing into box.
     */
    public List<Box> packThings(List<Thing> things) {
        List<Box> allBoxes = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);

        for (Thing member : things) {
            if (box.addThing(member)) {
            } else {
                allBoxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(member);
            }
        }
        allBoxes.add(box);
        return allBoxes;
    }
}
