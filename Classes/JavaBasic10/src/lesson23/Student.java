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
}


class NeotechStudent extends Student {

    String laptopBrand;

    NeotechStudent(String name, int age, String laptopBrand) {
        this.laptopBrand = laptopBrand;
//        I am not using super keyword here
        this.name = name;
        this.age = age;
    }
}


class CollegeStudent extends Student {

}

class SchoolStudent extends Student {

}