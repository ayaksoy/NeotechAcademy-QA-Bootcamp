package lesson04;

public class IfElse {
    public static void main(String[] args) {
        int myBalance = 5000;
        int myRequest = 1000;
        if (myRequest <= myBalance)
            System.out.println("Enjoy it!!");
        else
            System.out.println("you dont have enough money!!");

        System.out.println("--------------------------");

        int hours = 5;
        if (hours >= 10)
            System.out.println("good job!");
        else
            System.out.println("Your need to study more");


    }
}
