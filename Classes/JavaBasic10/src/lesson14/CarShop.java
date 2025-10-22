package lesson14;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(120, "Toyota", "Camry", "Blue", 2020, 28);
        Car car2 = new Car(150, "Honda", "Civic", "Red", 2021, 32);
        Car car3 = new Car();

        car3.make = "Ford";
        car3.model = "Mustang";
        car3.color = "Black";
        car3.year = 2019;
        car3.mpg = 22;
        car3.speed = 130;


        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.color + " " + car1.year + " " + car1.mpg + " MPG");
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.color + " " + car2.year + " " + car2.mpg + " MPG");

        System.out.println("Car 3: " + car3.make + " " + car3.model + " " + car3.color + " " + car3.year + " " + car3.mpg + " MPG");

        car1.drive();
        car2.drive();

        car1.stop();
        car2.stop();

        car1.transportPeople();
        car2.transportPeople();

        car3.drive();
        car3.stop();
        car3.transportPeople();

        int[] speeds = {car1.speed, car2.speed, car3.speed};

        System.out.println(speeds);

    }
}
