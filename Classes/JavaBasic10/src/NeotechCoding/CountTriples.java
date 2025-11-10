package NeotechCoding;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        String word = scan.next();
        String triple = "";
        int count = 0;
        // AaaaaBBCDDDD
        for (int i = 0; i < word.length(); i++) {

            triple = "" + word.charAt(i) + word.charAt(i) + word.charAt(i);
            if (word.contains(triple)) {
                count++;
                triple += word.charAt(i);
                if (word.contains(triple)) {
                    count++;
                    i++;
                }
                i += 2;
            }

        }
        System.out.println(count);
    }
}
