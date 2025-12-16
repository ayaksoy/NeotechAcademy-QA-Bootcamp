package NeotechCoding;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String inp = scan.next();

        if (inp.equals("Max_Payne") || inp.equals("Alan_Wake"))
            System.out.println("User found!");
        else
            System.out.println("User not found!");


    }
}
