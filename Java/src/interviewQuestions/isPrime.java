package interviewQuestions;

public class isPrime {
    public static void main(String[] args) {
        int num = 1;
        boolean isPrime = true;
        if (num == 1 || num == 0)
            isPrime = false;
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0)
                isPrime = false;
        }
        if (isPrime)
            System.out.println("Sayi asal");
        else
            System.out.println("Sayi asal degil");
    }
}
