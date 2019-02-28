
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
public class TextUserInterface {
    private Scanner scanner;
    private Dictionary sonastik;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.scanner = reader;
        sonastik = dictionary;
    }
    
    public void start() {
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        // String comm = "";
        
        while (true) {
            System.out.print("Statement: ");
            String comm = this.scanner.nextLine();
            if (comm.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (comm.equals("add")) {
                add();
            } else if (comm.equals("translate")) {
                translate();
            }
        }
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String finnishWord = this.scanner.nextLine();
        System.out.print("Translation: ");
        String englishWord = this.scanner.nextLine();
        sonastik.add(finnishWord, englishWord);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String finnishWord = this.scanner.nextLine();
        System.out.print("Translation: ");
        System.out.println(sonastik.translate(finnishWord));
    }
}
