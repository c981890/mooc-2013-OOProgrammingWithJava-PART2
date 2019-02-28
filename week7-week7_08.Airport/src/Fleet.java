
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
public class Fleet {

    private ArrayList<Airplane> airplanes;
    
    public Fleet() {
        this.airplanes = new ArrayList<Airplane>();
    }
    
    public void addAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }
    
    public void printPlanes() {
        for (Airplane member : this.airplanes) {
            System.out.println(member.toString());
        }
    }
    
    public void printPlaneInfo(String id) {
        for (Airplane member : this.airplanes) {
            if (id.equals(member.getId())) {
                System.out.println(member.toString());
            }
        }
    }
    
    public Airplane getPlane(String id) {
        Airplane airplane = new Airplane();
        for (Airplane member : this.airplanes) {
            if (id.equals(member.getId())) {
                airplane = member;
            }
        }
        return airplane;
    }

}
