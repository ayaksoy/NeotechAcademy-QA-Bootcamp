package lesson18;

public class Student {
    static String nationality;
    String name;
    int age;
    String lastName;

    public static void main(String[] args) {
        Student mercy = new Student();
        mercy.name = "mercy";
        mercy.age = 18;
        mercy.lastName = "idontknow";
        mercy.nationality = "Turkish";

        Student cem = new Student();
        cem.name = "cem";
        cem.age = 19;
        cem.lastName = "idontknow";
        cem.nationality = "abd";

        System.out.println(mercy.nationality);

    }
}
