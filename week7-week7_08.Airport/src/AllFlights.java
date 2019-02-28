
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
public class AllFlights {
    
    private ArrayList<Flight> allFlights;
    
    public AllFlights() {
        this.allFlights = new ArrayList<Flight>(); 
    }
    
    public void addFlight(Flight flight) {
        this.allFlights.add(flight);
    }
    
    public void printFlights() {
        for (Flight member : this.allFlights) {
            System.out.println(member);
        }
    }
    
}
