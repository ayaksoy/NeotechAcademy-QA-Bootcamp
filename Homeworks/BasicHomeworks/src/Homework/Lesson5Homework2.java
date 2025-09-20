package Homework;

public class Lesson5Homework2 {
    public static void main(String[] args) {
        boolean isAM = false;
        byte hour = 3;

        if (isAM)
            System.out.println("Good morning");
        else {
            if (hour < 3)
                System.out.println("Good afternoon");
            else
                System.out.println("Good Evening");
        }
    }
}
