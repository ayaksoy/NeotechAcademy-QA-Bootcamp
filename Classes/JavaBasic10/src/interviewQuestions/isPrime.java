package interviewQuestions;

public class isPrime {
    public static void main(String[] args) {
        int a = 11;
        boolean isAsal = true;
        for (int i = a - 1; i > 1; i--) {
            if (a % i == 0)
                isAsal = false;
        }
        if (isAsal)
            System.out.println("Sayi asal");
        else
            System.out.println("Sayi asal degil");
    }
}
