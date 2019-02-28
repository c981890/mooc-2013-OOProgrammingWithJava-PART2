
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
public class TextUserInterface {
    private Scanner scanner;
    private Fleet fleet;
    private AllFlights allFlights;
    private Airplane airplane;
    
    public TextUserInterface(Scanner reader, Fleet fleet, AllFlights allFlights) {
        this.scanner = reader;
        this.fleet = fleet;
        this.allFlights = allFlights;
        this.airplane = null;
    }
    
    public void startAirportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        mainLoop:
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String comm = this.scanner.nextLine();
            if (comm.equals("1")) {
                addAirplane();
            } else if (comm.equals("2")) {
                addFlight();
            } else if (comm.equals("x")) {
                startFlightService();
                break;
            }
        }
    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = this.scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.scanner.nextLine());
        Airplane airplane = new Airplane(id, capacity);
        this.fleet.addAirplane(airplane);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String id = this.scanner.nextLine();
        
        Airplane airplane;
        airplane = fleet.getPlane(id);
        
        System.out.print("Give departure airport code: ");
        String depCode = this.scanner.nextLine();
        
        System.out.print("Give destination airport code: ");
        String desCode = this.scanner.nextLine();
        
        Flight flight = new Flight(depCode, desCode, airplane);
        this.allFlights.addFlight(flight);
    }
    
    public void startFlightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while (true) {
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String comm = this.scanner.nextLine();
            
            if (comm.equals("1")) {
                printPlanes();
            } else if (comm.equals("2")) {
                // printFlights();
                this.allFlights.printFlights();
            } else if (comm.equals("3")) {
                printPlaneInfo();
            } else if (comm.equals("x")) {
                break;
            }
        }
    }
    
    public void printPlanes() {
        this.fleet.printPlanes();
    }
    
    public void printFlights() {
        this.allFlights.printFlights();
    }
    
    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String id = this.scanner.nextLine();
        this.fleet.printPlaneInfo(id);
    }
    
}
