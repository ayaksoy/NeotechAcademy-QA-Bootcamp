package lesson06;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

//        Lets create scanner object to fetch user input


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = input.next();
        System.out.println("Your name is " + name);

        System.out.println("How old are you");

        int age = input.nextInt();
        System.out.println("you a");


        input.close();


    }
}
