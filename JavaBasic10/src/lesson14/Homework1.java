package lesson14;

public class Homework1 {
    //	Homework 1:
//		Create an array of countries: north America countries, south America countries,
//		Europe countries, Asian countries, African countries. 
//		Then print all values from that array using 2 different loops and 
//		calculate how many total countries been stored.
    public static void main(String[] args) {

        String[][] countries = { // parent
                {"USA", "Canada"}, // north america
                {"Brazil", "Argentina", "Peru"}, // south america
                {"Denmark", "Germany", "France", "Turkiye"}, // europe
                {"China", "Japan", "Korea"}, // asia
                {"Chad", "Ghana", "Egypt", "Kenya", "Ethopia"} // africa
        };

        // basic for loop solution
        int total = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                total++;
            }
        }

        System.out.println("There are total of " + total + " countries!");

        // advanced for loop
        int total2 = 0;
        for (String[] row : countries) {
            for (String item : row) {
                total2++;
            }
        }
        System.out.println("There are total of " + total2 + " countries!");

    }

}
