package NeotechCoding;

import java.util.Scanner;

public class Print_First_Last_Chars {
}

class Temp {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));

    }
}