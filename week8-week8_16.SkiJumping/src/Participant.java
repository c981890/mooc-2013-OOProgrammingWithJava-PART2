/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class Participant implements Comparable<Participant>{
    
    private String name;
    private int points;
    
    public Participant(String name) {
        this.name = name;
        this.points = 0;
        
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    @Override
    public int compareTo(Participant participant) {
        return this.points - participant.getPoints();       
    }

    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
    
    
    
    
}
