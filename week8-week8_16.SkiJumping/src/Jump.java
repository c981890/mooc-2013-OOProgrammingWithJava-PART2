
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
public class Jump {
    
    private Participant participant;
    private List<Integer> jumpLengths;
    
    public Jump(Participant participant) {
        this.participant = participant;
        this.jumpLengths = new ArrayList<Integer>();
    }

    public List<Integer> getJumpLengths() {
        return jumpLengths;
    }
    
    public void addJump(int jumpLength) {
        this.jumpLengths.add(jumpLength);
    }

    public Participant getParticipant() {
        return participant;
    }
    
    public int sizeOfListJumpLengths() {
        return this.jumpLengths.size();
    }
   
}
