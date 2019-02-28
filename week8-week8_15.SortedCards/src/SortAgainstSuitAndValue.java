
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
public class SortAgainstSuitAndValue implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int result = 0;
        if (card1.getSuit() == card2.getSuit()) {
            result = card1.getValue() - card2.getValue();
        } else {
            result = card1.getSuit() - card2.getSuit();
        }
        return result;
    }
}