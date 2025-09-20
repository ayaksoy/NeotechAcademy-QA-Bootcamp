package Homework.Lesson05;

public class Lesson05Homework1 {
    public static void main(String[] args) {

        boolean allergies = true;
        short allergiesType = 6;

        if (!allergies)
            System.out.println("You’re healthy!");
        else {
            System.out.print("You have allergies ");
            if (allergiesType == 1)
                System.out.println("Don’t eat Peanut");
            else if (allergiesType == 2)
                System.out.println("Dont eat lactose");
            else if (allergiesType == 3)
                System.out.println("Dont eat seafood");
            else
                System.out.println("We dont kn0o9w what just be careful!");
        }

    }
}
