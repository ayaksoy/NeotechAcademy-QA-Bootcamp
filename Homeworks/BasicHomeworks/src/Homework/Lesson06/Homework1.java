package Homework.Lesson06;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
	/*
	 1. Ask the user to enter the height in inches.
	 Person should be classified as one of the following:
		• short (under 60 inch)
		• medium (between 60 -72 inch)
		• tall (over 72 inch)

	 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your height in inches:");
        double height = scan.nextDouble();

        if (height < 60) {
            System.out.println("Short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("Medium");
        } else {
            System.out.println("Tall");
        }

        // improvement assignment: add negative input handling

        scan.close();
    }

}











