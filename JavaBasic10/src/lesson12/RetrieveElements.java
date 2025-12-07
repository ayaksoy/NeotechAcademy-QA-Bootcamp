package lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// lets get the values of the array

		// 1st way: for loop
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ",");
		}

		System.out.println();

		// 2nd way: advanced for loop
		for (char grade : grades) {
			System.out.print(grade + ",");
		}

		System.out.println();

		String[] fruits = { "apple", "orange", "banana", "mango", "plum", "cherry" };

		// lets loop over the items of the fruits array
		for (int i = 0; i < fruits.length; i++) {
			String fruit = fruits[i];

			if (fruit.equals("mango")) {
				System.out.println(fruit + " is my fav!");
			} else {
				System.out.println(fruit);
			}
		}

		System.out.println();

		// lets use advanced/enhanced for loop now
		for (String fruit : fruits) {
			if (fruit.equals("mango")) {
				System.out.println(fruit + " is my fav!");
			} else {
				System.out.println(fruit);
			}
		}

	}

}
