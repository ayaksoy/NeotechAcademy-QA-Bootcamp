package lesson14;

public class Car {
    int speed;
    String make;
    String model;
    String color;
    int year;
    int mpg;

    public Car(int speed, String make, String model, String color, int year, int mpg) {
        this.speed = speed;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mpg = mpg;
    }

    public Car() {
    }

    void drive() {
        System.out.println("The car is driving");
    }

    void stop() {
        System.out.println("The car is stopping");
    }

    void transportPeople() {
        System.out.println("The car is transporting people");
    }

}
