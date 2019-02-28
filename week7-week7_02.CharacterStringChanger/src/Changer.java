
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aikitrumm
 */
public class Changer {
    private ArrayList<Change> members;

    public Changer() {
        this.members = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.members.add(change);
    }

    public String change(String characterString) {
        String deli = characterString;
        for (Change member : this.members) {
            deli = member.change(deli);          
        }    
        return deli;
    }

    public ArrayList<Change> getMembers() {
        return members;
    }
    
}
