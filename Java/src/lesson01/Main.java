package lesson01;

public class Main {
    static int a = 1;

    public static void main(String[] args) {
        Animal a1 = new Wolf();
        a1.sayHello();

        Wolf a2 = (Wolf) new Animal();
        a2.wolfBark();
    }
}
