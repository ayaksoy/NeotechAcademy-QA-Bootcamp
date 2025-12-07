package lesson04;

public class PrimitiveCasting {

    public static void main(String[] args) {

        double d1 = 3.5; // no casting here
        System.out.println(d1);

        double d2 = 5;
        System.out.println(d2);


        byte b1 = (byte) 5250;
        System.out.println(b1);

        long l1 = 17L;
        int num4 = (int) l1;
        System.out.println(num4);

        long l2 = 2341231431241122412L;
        int num5 = (int) l2;
        System.out.println(num5);
    }
}
