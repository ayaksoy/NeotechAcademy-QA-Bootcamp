package lesson09;

public class Task2 {
    public static void main(String[] args) {
        int evenNumbers = 0;
        int oddNumbers = 0;
        int allNumbers = 0;

        for (int i = 1; i <= 20; i += 2)
            oddNumbers += i;
        System.out.println("odd numbers sum " + oddNumbers);
        for (int i = 2; i <= 20; i += 2)
            evenNumbers += i;
        System.out.println("even numbers sum " + evenNumbers);
        for (int i = 1; i <= 20; i++)
            allNumbers += i;
        System.out.println("all numbers sum " + allNumbers);
    }
}
