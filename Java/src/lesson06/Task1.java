package lesson06;

import java.util.Scanner;

public class Task1 {
    // Write a program that asks the user to enter first name and
    // then last name. At the end, the system should display the user's full name.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // prompt the user to enter first name
        System.out.println("Enter your first name:");
        // catch the user input
        String firstName = scan.next();

        // prompt the user to enter the last name
        System.out.println("Enter your last name:");
        String lastName = scan.next();

        System.out.println("Your full name is " + firstName + " " + lastName);

        scan.close();

    }

}