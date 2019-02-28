
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
public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card member : this.hand) {
            System.out.println(member);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int sumOfHand() {
        int sum = 0;
        for (Card member : this.hand) {
            sum += member.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand hand) {            
        return this.sumOfHand() - hand.sumOfHand();
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitSorter);
    }
}
