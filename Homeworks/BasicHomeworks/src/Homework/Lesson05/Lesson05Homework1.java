package Homework.Lesson05;

public class Lesson05Homework1 {
    public static void main(String[] args) {

        boolean allergies = true;
        boolean hasPeanutAllergy = true;
        boolean hasLactoseAllergy = true;
        boolean hasBeeAllergy = true;
        boolean hasSeafoodAllergy = true;

        if (!allergies)
            System.out.println("You’re healthy!");
        else {
            System.out.print("You have allergies ");
            if (hasPeanutAllergy)
                System.out.println("Dont eat peanut");
            if (hasLactoseAllergy)
                System.out.println("Dont drink milk");
            if (hasBeeAllergy)
                System.out.println("Stay away from bees");
            if (hasSeafoodAllergy)
                System.out.println("Dont eat seafood");
        }
    }
}
