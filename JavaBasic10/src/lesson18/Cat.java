package lesson18;

public class Cat {
    // static variables
    static boolean isIndependent = true;
    // instance variables
    String name;
    int weight;
    String color;

    // methods/behaviors/functions
    void sayMeow() {
        System.out.println("meowww");
    }

    void displayInfo() {
        System.out.println(name + " " + weight + " " + color + " " + isIndependent);
    }
}
