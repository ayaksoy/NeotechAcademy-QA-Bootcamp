package lesson06;

import java.util.Scanner;

public class Task3 {
//	Write a program that asks user to enter two numbers and prints which one is larger.

    // We need a Scanner object to grab the user input
    // We need two variables to hold the input values
    // Finally we need to write some if-else statement to compare two numbers
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scan.nextInt();

        System.out.println("Now enter the second number:");
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is greater than " + number1);
        } else {
            System.out.println("Both numbers are the same!");
        }

        scan.close();

    }

}