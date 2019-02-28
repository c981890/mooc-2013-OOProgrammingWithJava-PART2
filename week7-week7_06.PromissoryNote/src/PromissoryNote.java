
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class PromissoryNote {
    private HashMap<String, Double> table;
    
    public PromissoryNote() {
         this.table = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.table.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if(this.table.containsKey(whose)) {
            return this.table.get(whose);
        }
        return 0;
    }
}
