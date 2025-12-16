package lesson11;

import java.util.Arrays;

public class PrintArrays {

	public static void main(String[] args) {

		int[] points = {95, 90, 80, 85, 75, 100, 72};
		
		//print elements one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		System.out.println(points[5]);
		System.out.println(points[6]);
		
		
		//first loop: i = 0, points[0] ---> 95
		//second loop: i = 1, points[1] ---> 90
		//third loop: i = 2, points[2] ---> 80
		
		//we use the size of the array to decide the number of iterations needed
		int size = points.length;
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(points[i] + " ");
		}

		System.out.println();
		System.out.println("==============================");
		
		//How can we calculate the sum of all the points in the array???
		
		//to get the sum, I need to travel to each value in the array
		
		int sum = 0; 
		
		for (int i = 0; i < size; i++)
		{
			sum += points[i];  //same as saying: sum = sum + points[i]
		
		}
		
		System.out.println("The total sum is: "+ sum);
		System.out.println("The average is: " + sum/size); //integer result
		System.out.println("The average is: " + (double) sum/size);
		
		
		System.out.println(Arrays.toString(points));
	}

}
