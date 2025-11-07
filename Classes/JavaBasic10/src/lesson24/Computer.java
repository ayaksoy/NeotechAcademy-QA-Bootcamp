package lesson24;

public class Computer {
    String name;
    Double price;
    String operationSystem;

    Computer(double price, String operationSystem, String name) {
        this.name = name;
        this.operationSystem = operationSystem;
        this.price = price;
    }

    public static void main(String[] args) {
        Computer apple = new Apple(1200, "macOS", "MacBook Pro");
        Computer lenovo = new Lenovo(800, "Windows", "Lenovo ThinkPad");
        Computer hp = new HP(700, "Windows", "HP Pavilion");
        Computer dell = new Dell(900, "Linux", "Dell Inspiron");

        Computer[] computers = {apple, lenovo, hp, dell};
        for (Computer computer : computers) {
            computer.printInfo();
            System.out.println("-----");
        }
    }

    void run() {
        System.out.println("Computer is running");
    }

    void openBrowser() {
        System.out.println("Opening browser");
    }

    void printInfo() {
        System.out.println("Name is " + name);
        System.out.println("Operation system is " + operationSystem);
        System.out.println("Price is " + price);

        run();
        openBrowser();
    }

}

class Apple extends Computer {
    Apple(double price, String operationSystem, String name) {
        super(price, operationSystem, name);
    }

    public static void main(String[] args) {
    }

    @Override
    void openBrowser() {
        System.out.println("Opening Safari");
    }

    void startLaunchpad() {
        System.out.println("Starting launchpad");
    }

    @Override
    void printInfo() {
        System.out.println("Name is " + name);
        System.out.println("Operation system is " + operationSystem);
        System.out.println("Price is " + price);

        run();
        openBrowser();
        startLaunchpad();
    }
}

class Lenovo extends Computer {
    Lenovo(double price, String operationSystem, String name) {
        super(price, operationSystem, name);
    }

    @Override
    void openBrowser() {
        System.out.println("Opening Chrome");
    }

}

class HP extends Computer {
    HP(double price, String operationSystem, String name) {
        super(price, operationSystem, name);
    }

    @Override
    void run() {
        System.out.println("HP is running");
    }
}

class Dell extends Computer {
    Dell(double price, String operationSystem, String name) {
        super(price, operationSystem, name);
    }

    @Override
    void run() {
        System.out.println("Dell is running");
    }
}

