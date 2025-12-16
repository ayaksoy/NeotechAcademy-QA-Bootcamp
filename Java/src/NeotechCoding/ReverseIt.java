package NeotechCoding;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        StringBuffer sbWord = new StringBuffer(word);
        //WRITE YOUR CODE HERE

        if (sbWord.length() < 5)
            System.out.println("Too short!");
        else if (sbWord.length() == 5)
            System.out.println(sbWord.reverse());
        else
            System.out.println("Too long!");
    }
}
