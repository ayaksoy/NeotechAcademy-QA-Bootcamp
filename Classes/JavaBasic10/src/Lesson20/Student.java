package Lesson20;

public class Student {
//        Write program as a Student class that has instance variables name and address.
//        Create a constructor that will initialize those variables. Print name & address
//        of given student using displayInfo method.

    String name;
    String address;

    public Student(String name_, String address_) {
        address = address_;
        this.name = name_;
    }

    Student() {

    }


    public static void main(String[] args) {
        Student student = new Student("John Doe", "123 Main St");
        student.displayInfo();
    }

    public void displayInfo() {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }
}
