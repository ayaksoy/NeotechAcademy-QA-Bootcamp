package interwievQuestions;

public class Swap2Nums {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
