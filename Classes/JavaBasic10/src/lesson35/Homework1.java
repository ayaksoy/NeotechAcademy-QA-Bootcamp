package lesson35;

public class Homework1 {
    public static void main(String[] args) {
//        Homework 1:
//        Create a method checkUserNamethat will throw a runtime exception.
//        Method should throw an exception when the entered username is less than 5 characters.
        try {
            checkUserNamethat("eo");
            System.out.println("Username is valid");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    static void checkUserNamethat(String userName) {
        if (userName.length() < 5)
            throw new RuntimeException("userName cannot be under 5 characters");
    }
}
