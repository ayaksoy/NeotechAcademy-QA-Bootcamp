package lesson19;

public class Task2Demo {

    public static void main(String[] args) {

        String day = "Thursday";

        String reversed = Task2.reverse(day);
        System.out.println("The reversed string is: " + reversed);

        System.out.println(Task2.reverse2(day));
    }
}
