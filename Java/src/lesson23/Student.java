package lesson23;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student() {
    }

    public static void main(String[] args) {
        // Upcasting
        Student student = new NeotechStudent("Alice", 20, "Dell");
    }
}


class NeotechStudent extends Student {

    String laptopBrand;

    NeotechStudent(String name, int age, String laptopBrand) {
        this.laptopBrand = laptopBrand;
//        I am not using super keyword here
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Laptop: " + laptopBrand);
    }
}


class CollegeStudent extends Student {

}

class SchoolStudent extends Student {

}