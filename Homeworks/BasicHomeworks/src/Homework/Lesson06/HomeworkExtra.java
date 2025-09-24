package Homework.Lesson06;


import java.util.Scanner;

public class HomeworkExtra {
    /*
     3. Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print
        "The temperature in __ is __"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a city:");
        String city = input.nextLine();

        System.out.println("Please enter the temprature in Fahrenheit:");
        double fahrenheit = input.nextDouble();

        // convert F to C: (f - 32) * 5/9
        double celcius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in " + city + " is " + celcius + "C!");

        input.close();

    }

}