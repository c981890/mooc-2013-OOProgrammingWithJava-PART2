/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class Change {
        private char fromCharcter;
        private char toCharacter;
        
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharcter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString) {
        return characterString.replace(this.fromCharcter, this.toCharacter);
    }
    
    
}
