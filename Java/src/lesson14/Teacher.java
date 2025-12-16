package lesson14;

public class Teacher extends Student {
    String name;
    double salary;
    String subject;

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    void yellAtStudents() {
        System.out.println(name + " is yelling at students ");
    }
}