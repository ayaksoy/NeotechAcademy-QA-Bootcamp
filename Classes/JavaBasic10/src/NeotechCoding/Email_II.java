package NeotechCoding;

import java.util.Scanner;

public class Email_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Write your code here

        String inp = scan.next();

        String[] output = inp.split("[_@.]");
        System.out.println("First name: " + output[0]);
        System.out.println("Last name: " + output[1]);
        System.out.println("Domain: " + output[2]);


    }
}
}
