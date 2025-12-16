package lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

    public static void main(String[] args) {

        int num = 1;

        //The execution of the while loop follows these steps:
        //1. check the loop condition (true or false)
        //if condition is false, then we skip the entire block
        //if it is true, then we go inside the block, execute statements
        // we go all the way to the end and then, we go to the condition again


        //at the start...
        // is num < 11

        while (num < 11) // loop header - it contains the condition
        {//block of loop code starts
            System.out.println(num);

            num++;
            //clock of loop code ends here
        }


        //assigning num back to 1
        num = 1;

        while (num < 11) {
            System.out.println(num++); //print then increment
        }

        //so, if you noticed, for a loop we define:
        //1. the starting point.... (num = 1 in this case)
        //2. the changing rate (increment in this case)
        //3. the ending criteria (num < 11 in this case)


        //How can I enter 5 numbers from the console using while loop???

        Scanner scan = new Scanner(System.in);

        //in order to make sure the loop runs 5 times, i need to decide
        //the starting point, increment and ending point.

        int count = 1; //start at 1, increment by 1, until 5

        while (count <= 5) {
            System.out.println("Enter a number: ");
            int var = scan.nextInt();

            System.out.println("You entered: " + var);

            count++;
        }


        //2nd way:

        //assign count to 5
        count = 5; //start at 5, decrement by 1, until 1

        while (count > 0) {
            System.out.println("Enter a number: ");
            int var = scan.nextInt();

            System.out.println("You entered: " + var);

            count--;
        }


    }

}