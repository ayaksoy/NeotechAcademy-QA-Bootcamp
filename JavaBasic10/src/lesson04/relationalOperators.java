package lesson04;

public class relationalOperators {

    public static void main(String[] args) {
        System.out.println(6 < 8);

        int a = 6;
        int b = 8;
        System.out.println(a > b);
        System.out.println(a < b);

        int c = 8;
        System.out.println(c == 8);

        System.out.println(c != b); // false

        System.out.println("-----------------------");

        double d1 = 15.5;
        double d2 = 8.5;
        boolean res = d1 > d2;
        System.out.println(res); //true

        boolean res2 = d1 == d2;
        System.out.println(res2); //false

        boolean res3 = d1 >= d2;
        System.out.println(res3); //true
    }
}
