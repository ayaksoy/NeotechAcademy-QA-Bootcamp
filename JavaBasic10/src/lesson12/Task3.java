package lesson12;

public class Task3 {
//	3. Create an array of countries.
//	While retrieving all values from an array print capital for each country.
//	(use 2 different loops).
	public static void main(String[] args) {

		String[] countries = { "Turkiye", "USA", "France", "Bulgaria", "India" };

		// basic for loop solution
		for (int i = 0; i < countries.length; i++) {

			String country = countries[i];

			if (country.equals("Turkiye")) {
				System.out.println(country + " - Ankara");
			} else if (country.equals("USA")) {
				System.out.println(country + " - Washington DC");
			} else if (country.equals("France")) {
				System.out.println(country + " - Paris");
			} else if (country.equals("Bulgaria")) {
				System.out.println(country + " - Sofia");
			} else if (country.equals("India")) {
				System.out.println(country + " - New Delhi");
			} else {
				System.out.println("Unknown country");
			}

		}

		// advanced for loop solution
		for (String country : countries) {
			if (country.equals("Turkiye")) {
				System.out.println(country + " - Ankara");
			} else if (country.equals("USA")) {
				System.out.println(country + " - Washington DC");
			} else if (country.equals("France")) {
				System.out.println(country + " - Paris");
			} else if (country.equals("Bulgaria")) {
				System.out.println(country + " - Sofia");
			} else if (country.equals("India")) {
				System.out.println(country + " - New Delhi");
			} else {
				System.out.println("Unknown country");
			}
		}

		// task:
		// 3rd way: create a second array for the capitals
		// loop over the countries array and and get the capital from the capitals array

	}

}
