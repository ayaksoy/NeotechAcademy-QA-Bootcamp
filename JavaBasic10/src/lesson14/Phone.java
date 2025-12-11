package lesson14;

public class Phone {
//	Create a Class "Phone". Create 3 Objects of it: 
// iPhone, Android, Nokia with specific  attributes and behaviors.

    // Lets create some properties/attributes
    String brand, model, color;
    int price;

    // behaviors
    // call(), text(), navigate()

    void call() {
        System.out.println(brand + " makes calls!");
        System.out.println("And the call quality is greate for " + model);
    }

    void text() {
        System.out.println(brand + " texts!");
    }

    void navigate() {
        System.out.println(brand + " navigates!");
    }
}
