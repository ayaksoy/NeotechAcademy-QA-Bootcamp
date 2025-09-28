package lesson09;

import java.util.Scanner;

public class HalosRequest {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int lines = scan.nextInt();
        int star;
        int space = 0;

        while (lines > 0) {

            for (int i = 0; i < space; i++)
                System.out.print(" ");
            space++;
            star = lines * 2 - 1;
            while (star-- > 0)
                System.out.print("*");
            System.out.println();
            lines--;
        }
    }
}
