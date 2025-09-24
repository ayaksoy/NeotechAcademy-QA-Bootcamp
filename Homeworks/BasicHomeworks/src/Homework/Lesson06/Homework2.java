package Homework.Lesson06;

import java.util.Scanner;

public class Homework2 {
    /*
     2. Write a program that will ask for the day (a number from 1-7).
     Print whether it is a weekend or weekday.
        If any day from 1-5 → output "It is a weekday"
        Any day from 6-7 → output "It is a weekend",
        Any other day → output "Invalid day"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int day = scan.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("It is a weekday!");
        } else if (day >= 6 && day <= 7) {
            System.out.println("It is the weekend!");
        } else {
            System.out.println("Invalid entry!!!");
        }

        // lets solve it using the or operator
        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("It is a weekday!");
        } else if (day == 6 || day == 7) {
            System.out.println("It is the weekend!");
        } else {
            System.out.println("Invalid entry!!!");
        }

        // how about an hybrid solution
        if (day >= 1 && day <= 5) {
            System.out.println("It is a weekday!");
        } else if (day == 6 || day == 7) {
            System.out.println("It is the weekend!");
        } else {
            System.out.println("Invalid entry!!!");
        }

        scan.close();
    }

}
