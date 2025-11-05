package Lesson18;

public class Employee {
    static String CEO = "elion";
    Integer eID;
    int salary;
    Integer age;

    public static void main(String[] args) {
    }

    static public void printStaticInfo() {
        System.out.println("CEO = " + CEO);
    }

    void printInfo() {
        System.out.println("eId = " + eID);
        System.out.println("salary = " + salary);
        printStaticInfo();
    }
}
