
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
public class Reader {
    private Scanner scanner;
    
    public Reader() {
        this.scanner = new Scanner(System.in);
    }
    
    public String readString() {
        String line = this.scanner.nextLine();
        return line;
    }
    
    public int readInteger() {
        int number = Integer.parseInt(this.scanner.nextLine());
        return number;
    }
}
