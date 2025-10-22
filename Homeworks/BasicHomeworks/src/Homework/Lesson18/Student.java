package Homework.Lesson18;

public class Student {
    int id;
    String name;
    static int numberOfStudents = 0;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Mercy";
        student1.id = 1;
        Student.numberOfStudents++;

        Student student2 = new Student();
        student1.name = "ozzy";
        student1.id = 2;
        Student.numberOfStudents++;

        Student student3 = new Student();
        student1.name = "H4L0";
        student1.id = 3;
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);
    }
}
