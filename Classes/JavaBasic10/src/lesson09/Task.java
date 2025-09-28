package lesson09;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int total = 0;
        int number;

        while (true) {
            System.out.println("Enter positive numbers (-1 to quit)");
            number = input.nextInt();
            if (number == -1)
                break;
            total += number;
            number = 0;
        }
        System.out.println("Total is " + total);

    }
}
