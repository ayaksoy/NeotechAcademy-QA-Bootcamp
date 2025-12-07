package lesson12;

public class Task2 {
//	2. Create an array of integers and calculate the sum of all elements in the array
//	(use 2 different loops).
	public static void main(String[] args) {
		int[] numbers = { 10, 15, 20, 25, 30 };

		// 1st way: basic for loop
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("The sum is " + sum);

		// 2nd way: advanced for loop
		int sum2 = 0;
		for (int number : numbers) {
			sum2 += number;
		}

		System.out.println("The sum is " + sum2);

		// 3rd way: while loop
		int sum3 = 0;
		int i = 0;
		while (i < numbers.length) {
			sum3 += numbers[i];
			i++;
		}

		System.out.println("The sum is " + sum3);

	}

}
