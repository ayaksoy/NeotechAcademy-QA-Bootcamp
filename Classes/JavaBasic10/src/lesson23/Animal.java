package lesson23;

public class Animal {

    String species;
    int age;

    Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    Animal() {
    }

    void Eat() {
        System.out.println("The animal is eating");
    }

    void Sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Wolf extends Animal {

    Wolf(String species, int age) {
        super(species, age);
    }

    void Eat() {
        System.out.println("The wolf is eating meat");
    }
}

class Bear extends Animal {

    void Roar() {
        System.out.println("ROAR!!!");
    }
}

class Fox extends Animal {
    String FurColor;
}