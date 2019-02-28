
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
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.owners.containsKey(plate)) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        String owner = null;
        if (this.owners.containsKey(plate)) {
            owner = this.owners.get(plate);
        }
        return owner;
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate name : this.owners.keySet()) {

            String key = name.toString();
            String value = this.owners.get(name).toString();
            System.out.println(key);

        }
    }

    public void printOwners() {
        for (String s : new HashSet <String> (this.owners.values())) {
            System.out.println(s);
        }
    }

}
