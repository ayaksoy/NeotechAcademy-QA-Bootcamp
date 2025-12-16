package lesson26;

public class Person {
    final String id;
    String name;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public final void sayHello() {
        System.out.println("Hello " + name);
    }

}
