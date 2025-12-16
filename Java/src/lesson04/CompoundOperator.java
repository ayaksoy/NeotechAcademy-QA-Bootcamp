package lesson04;

public class CompoundOperator {
    public static void main(String[] args) {
//        aka shorthand operator

        int num = 100;
        System.out.println(num);

        num = 150;
        System.out.println(num);

        num = num + 50;
        System.out.println(num);

//        another form to do the same operation
        num += 100;
        System.out.println(num);

        num -= 100;
        System.out.println(num);

        num /= 5;
        System.out.println(num);

        num *= 6;
        System.out.println(num);

        num &= 8;
        System.out.println(num);


    }
}
