
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
public class Jumps {
    
    private List<Jump> jumps;
    
    public Jumps() {
        this.jumps = new ArrayList<Jump>();
    }
    
    public void addJump(Jump jump) {
        this.jumps.add(jump);
    }

    public List<Jump> getJumps() {
        return jumps;
    }
   
    
}
