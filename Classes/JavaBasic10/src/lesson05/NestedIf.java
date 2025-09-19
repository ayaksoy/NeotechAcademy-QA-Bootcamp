package lesson05;

public class NestedIf {
    public static void main(String[] args) {
        boolean isSchoolDay = true;
        boolean isMorning = true;
        if (isMorning) {
            System.out.println("Good morning");
            if (isSchoolDay)
                System.out.println("You have to be at school");
            else
                System.out.println("you should be home");
        } else
            System.out.println("Good afternoon");
        
    }
}
