package lesson25;

public abstract class Computer {
    double price;
    String operationSystem;
    String name;

    Computer(double price, String operationSystem, String name) {
        this.price = price;
        this.operationSystem = operationSystem;
        this.name = name;
    }

    abstract void whatIsOperationSystem();

    abstract void whatIsName();

    abstract void openBrowser();
}

class Apple extends Computer {
    Apple(double price, String operationSystem, String name) {
        super(price, operationSystem, name);
    }

    @Override
    void whatIsOperationSystem() {
        System.out.println("Operation system is " + operationSystem);
    }

    @Override
    void whatIsName() {
        System.out.println("Name is " + name);
    }

    @Override
    void openBrowser() {
        System.out.println("Opening Safari");
    }
}
