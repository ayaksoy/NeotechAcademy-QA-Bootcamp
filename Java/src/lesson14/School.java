package lesson14;

public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Mr. Smith";
        teacher1.salary = 50000;
        teacher1.subject = "Math";

        Student student1 = new Student();
        student1.studentNr = 1;
        student1.name = "Alice";
        student1.gradeLevel = 10;

        Student student2 = new Student();
        student2.studentNr = 2;
        student2.name = "Bob";
        student2.gradeLevel = 11;

        student1.study();
        student2.sleep();
        teacher1.teach();
        teacher1.yellAtStudents();
        Student student3 = new Teacher();
    }
}
