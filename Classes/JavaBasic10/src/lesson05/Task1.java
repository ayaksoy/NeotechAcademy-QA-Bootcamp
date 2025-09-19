package lesson05;

public class Task1 {
    public static void main(String[] args) {

        byte day = 1;

        if (day == 1)
            System.out.println("Today is monday and we are working!");
        else if (day == 2)
            System.out.println("Today is Tuesday and we are working!");
        else if (day == 3)
            System.out.println("Today is Wednesday and we are working!");
        else if (day == 4)
            System.out.println("Today is Thursday and we are working!");
        else if (day == 5)
            System.out.println("Today is Friday and we are working!");
        else
            System.out.println("We are on a break on Weekends!");


        System.out.println("----------------------");

        if (day < 1)
            System.out.println("Wrong day value");
        else if (day < 6)
            System.out.println("Weekday we are working");
        else if (day < 8)
            System.out.println("Weekend we are resting");
        else
            System.out.println("Wrong day value");
    }
}