package Homework;

public class InterviewQuestion1 {
    public static void main(String[] args) {
//        Write a Java Program to check whether number is Even or Odd.
        int num = 1212312566;
        boolean isEven = true;

        if (num % 2 == 0)
            isEven = true;
        else
            isEven = false;

        if (isEven)
            System.out.println("Number " + num + " is even");
        else
            System.out.println("Number " + num + " is odd");

    }
}
