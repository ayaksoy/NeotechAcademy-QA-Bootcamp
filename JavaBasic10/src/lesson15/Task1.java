package lesson15;

public class Task1 {
    /*
     * method1: Create a method that will take 2 parameters as numbers and prints
     * which number is larger.
     *
     * method2: Create a method that will take a number and prints whether the
     * number is even or odd.
     *
     * method3: Create a method that will say Hello in a different language based on
     * the country that will passed when method is executed.
     */

    public static void main(String[] args) {

        Task1 obj = new Task1();

        obj.larger(33, 22);
        obj.larger(10, 10);

        obj.evenOrOdd(79);
        obj.evenOrOdd(90);

    }

    void larger(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is larger!");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger!");
        } else {
            System.out.println("numbers are equal!");
        }
    }

    void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

}
