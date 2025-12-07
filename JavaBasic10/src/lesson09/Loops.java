package lesson09;

public class Loops {
    public static void main(String[] args) {

        for (int i = 11; i <= 20; i++) {
            if (i == 13)
                continue;
            System.out.println("Happy " + i + "th birthday");
        }

    }
}

