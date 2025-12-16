package lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 	Ask the user to enter an integer and build the following pattern:
			Hint: Use scanner, if user entered number 5, there should be two parts
			The first part, 1 to 5
			The second part, 4 to 1
			
			1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
			1 2 3 4 
			1 2 3 
			1 2 
			1
		 
		 */
		
		
		
		// in the first iteration: 
			// i = 1, j = 1, how many times does the inner loop run? 1
		// in the second iteration: 
			// i = 2, j = 1, .... ? it will run 2 times
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		//for the next part, I can just create the opposite of the nested loop above
		
		for (int i = num - 1; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		
		

	}

}
