
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int lengthOfCharacterString = characterString.length();
        String smiley = ":)";
        int i = 0;
        if (characterString.length() % 2 == 1) {
            for (i = 0; i < (lengthOfCharacterString + 8) / 2; i++) {
                System.out.print(smiley);
            }
            System.out.println("");
            System.out.println(":) " + characterString + "  :)");
            for (i = 0; i < (lengthOfCharacterString + 8) / 2; i++) {
                System.out.print(smiley);
            }
        } else {
            for (i = 0; i < (lengthOfCharacterString + 6) / 2; i++) {
                System.out.print(smiley);
            }
            System.out.println("");
            System.out.println(":) " + characterString + " :)");
            for (i = 0; i < (lengthOfCharacterString + 6) / 2; i++) {
                System.out.print(smiley);
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}
