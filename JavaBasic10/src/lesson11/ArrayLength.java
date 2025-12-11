package lesson11;

public class ArrayLength {

	public static void main(String[] args) {

		//create an array of names
		
		String[] names = new String[5];
		
		names[0] = "Sabah";
		names[1] = "Nevzat";
		names[2] = "Cris";
		names[3] = "Eo";
		names[4] = "Maya";
				
		int nameSize = names.length;
		System.out.println(nameSize);
		
		
		
		//another way to declare an array
		int[] scores = {90, 95, 85, 80, 70};
		System.out.println(scores.length); //what is the size of the array?
		
		//I can change the value of the scores
		scores[4] = 75; 
		//but I cannot change the size of the array
		
		
	}

}
