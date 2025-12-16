package lesson03;

public class ModulusOperator {
    public static void main(String[] args) {
        int a = 13;
        int b = 5;
        int div = a / b;
        System.out.println("div --> " + div); // resul is 2 the rest is discarded/lost

        double d1 = 13;
        double d2 = 5;
        double res = d1 / d2;
        System.out.println("res --> " + res);


        int remainder = 13 % 5;
        System.out.println("remainder --> " + remainder);

        int num1 = 17;
        int num2 = 4;

        int rem = num1 % num2;
        System.out.println("rem --> " + rem);

    }
}
