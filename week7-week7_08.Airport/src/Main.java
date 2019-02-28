
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        
        Scanner reader = new Scanner(System.in);
        Fleet fleet = new Fleet();
        AllFlights allFlights = new AllFlights();
        
        // String id1 = "h-al";
        // int capacity1 = 42;
        // Airplane hal = new Airplane(id1, capacity1);
        
        // String id2 = "j-al";
        // int capacity2 = 100;
        // Airplane jal = new Airplane(id1, capacity1);
        
        // fleet.addAirplane(hal);
        // fleet.addAirplane(jal);
        
        // String depCode1 = "BAL";
        // String desCode1 = "HAL";
        // Flight flight1 = new Flight(depCode1, desCode1, hal);
        
        // String depCode2 = "BAL";
        // String desCode2 = "HAL";
        // Flight flight2 = new Flight(depCode2, desCode2, jal);
        
        // allFlights.addFlight(flight1);
        // allFlights.addFlight(flight2);
        
        // System.out.println("All flights");
        // allFlights.printFlights();
        
        TextUserInterface ui = new TextUserInterface(reader, fleet, allFlights);
        ui.startAirportPanel();
        
    }
}
