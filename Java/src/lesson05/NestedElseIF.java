package lesson05;

public class NestedElseIF {
    public static void main(String[] args) {
        boolean isQuizTaken = false;
        byte score = 85;

        if (isQuizTaken) {
            if (score >= 90)
                System.out.println("A");
            else if (score >= 80)
                System.out.println("B");
            else if (score >= 70)
                System.out.println("C");
            else
                System.out.println("F");
        } else
            System.out.println("You did not join quiz");
    }
}
