package lesson11;

public class Task1 {

	public static void main(String[] args) {
		/* 
		 Task: 
		 
		 Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 Then print the grade B (use 2 different ways of creating an array).
		 
		 */
		
		//1st way: 
		
		char[] grades1 = new char[6];
		
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		
		System.out.println("The grade is: " + grades1[1]);
		
		
		//2nd way: 
		
		char[] grades2 = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println("The grade is: " + grades2[1]);
		
		

	}

}
