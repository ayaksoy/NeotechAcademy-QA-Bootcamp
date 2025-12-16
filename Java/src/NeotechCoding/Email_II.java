package NeotechCoding;

import java.util.Scanner;

public class Email_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Write your code here

        String inp = scan.next();

        String[] output = inp.split("[_@.]");

        output[0] = output[0].substring(0, 1).toUpperCase() + output[0].substring(1);
        output[1] = output[1].substring(0, 1).toUpperCase() + output[1].substring(1);

        System.out.println("First name: " + output[0]);
        System.out.println("Last name: " + output[1]);
        System.out.println("Domain: " + output[2]);


    }
}
