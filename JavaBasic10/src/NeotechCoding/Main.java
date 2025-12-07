package NeotechCoding;

abstract class Marks {
    abstract double getAverage();
}

class StudentA extends Marks {
    double mark1, mark2, mark3;

    StudentA(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getAverage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}

class StudentB extends Marks {
    double mark1, mark2, mark3, mark4;

    StudentB(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getAverage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}

public class Main {
    public static void main(String[] args) {
        StudentA a = new StudentA(80, 90, 70);
        StudentB b = new StudentB(75, 85, 95, 80);

        System.out.println("Average of Student A: " + a.getAverage());
        System.out.println("Average of Student B: " + b.getAverage());
    }
}
