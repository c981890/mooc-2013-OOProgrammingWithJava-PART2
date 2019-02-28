/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class Flight {

    private String departureAirportCode;
    private String destinationAirportCode;
    private Airplane airplane;
    
    public Flight(String departureAirportCode, String destinationAirportCode, Airplane airplane) {
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;   
        this.airplane = airplane;
    }

    
    public String toString() {
                
        return this.airplane + " (" + this.departureAirportCode + "-" + this.destinationAirportCode + ")";
    }
    
    
}
