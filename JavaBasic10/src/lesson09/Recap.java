package lesson09;

public class Recap {

    public static void main(String[] args) {

        // print good morning five times
        System.out.println("Good morning");
        System.out.println("Good morning");
        System.out.println("Good morning");
        System.out.println("Good morning");
        System.out.println("Good morning");

        System.out.println("-----while loop-----------");

        int count = 1;
        while (count <= 5) {
            System.out.println("Good morning");
            count++; // count = count + 1;
        }
        // assignment: convert it to count--

        System.out.println("------do/while loop---------");

        int count2 = 1;
        do {
            System.out.println("Good morning");
            count2++;
        } while (count2 <= 5);

    }

}