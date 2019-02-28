
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
public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : this.dictionary.keySet()) {
            list.add(key + " = " + this.translate(key));
        }
        return list;
    }
}
