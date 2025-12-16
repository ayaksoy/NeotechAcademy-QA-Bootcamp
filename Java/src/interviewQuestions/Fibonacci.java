package interviewQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibo(i));
        }
    }

//    static int fibo(int num) {
//
//        if (num == 1)
//            return 1;
//        else if (num == 0) {
//            return 0;
//        } else {
//            return fibo(num - 1) + fibo(num - 2);
//
//        }

    static int fibo(int num) {
        if (num <= 1) return num;

        int nMinusOne = 1;
        int nMinusTwo = 0;
        int fibo = 0;

        for (int i = 2; i <= num; i++) {
            fibo = nMinusOne + nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = fibo;
        }
        return fibo;

    }
}
