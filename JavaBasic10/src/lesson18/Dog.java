package lesson18;

public class Dog {
    // static variables: belong to Dog class
    static String breed = "Husky";
    static int paws = 4;
    // instance variables: belong to instances
    String name;
    int age;

    void displayInfo() {
        System.out.println(name + " " + age + " " + breed + " " + paws);
    }
}
