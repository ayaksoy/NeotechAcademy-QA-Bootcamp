package lesson06;

public class LogicalAND {
    public static void main(String[] args) {
        int num = 111;
        if (num > 0 && num < 11)
            System.out.println("It is a small number");
        else if (num > 10 && num <= 100)
            System.out.println("It is a medium number");
        else if (num >= 101 && num <= 1000)
            System.out.println("It is a large number");
        else
            System.out.println("Out of range!");
    }
}
