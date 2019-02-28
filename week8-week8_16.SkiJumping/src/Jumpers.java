
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
public class Jumpers {

    // private ArrayList<Participant> jumpers;
    private List<Participant> jumpers;
    
    public Jumpers() {
        this.jumpers = new ArrayList<Participant>();
    }
    
    public void addParticipant(Participant participant) {
        this.jumpers.add(participant);
    }

    public List<Participant> getJumpers() {
        return jumpers;
    }
    
    public List<Participant> getSortedReverseJumpers() {
        Collections.sort(jumpers);
        return jumpers;
    }
    
    public int size() {
        return this.jumpers.size();
    }

    // public void setPoints(Participant key, int points) {
    //     this.jumpers.put(key, this.jumpers.get(key) + points);
    // }
    
    public int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public ArrayList<Integer> judgeVotes() {
        ArrayList<Integer> votes = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            votes.add(getRandomNumberInRange(10, 20));
        }
        return votes;
    }

    public int sumOfJudgeVotes(ArrayList<Integer> judgeVotes) {
        int points = 0;
        Collections.sort(judgeVotes);
        for (int i = 1; i < 4; i++) {
            points += judgeVotes.get(i);
        }
        return points;
    }
}
