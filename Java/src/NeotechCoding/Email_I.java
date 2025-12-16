package NeotechCoding;

import java.util.Scanner;

public class Email_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write your code here

        String inp = scan.next();

        String[] splitted = inp.split("[_@]");
        String reversed = "";


        if (splitted.length == 3) {
            reversed += splitted[1] + "_";
            reversed += splitted[0] + "@";
            reversed += splitted[2];
            System.out.println(reversed);
        } else
            System.out.println(inp);


    }
}
