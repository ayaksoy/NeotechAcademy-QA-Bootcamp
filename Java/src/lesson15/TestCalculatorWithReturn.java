package lesson15;

public class TestCalculatorWithReturn {

    public static void main(String[] args) {

        CalculatorWithReturn cal = new CalculatorWithReturn();

        int result = cal.add(14, 89);
        System.out.println(result);
        // OR
        System.out.println(cal.add(45, 66));

        // this will return nothing; it will just print the result in console
        cal.add2(55, 39);

        // we may use the return value
        System.out.println(result * 2);

        int result2 = cal.multiply(33, 88);
        System.out.println(result2);

        double result3 = cal.divide(431, 11);
        System.out.println(result3);

        System.out.println("----------------");

        // what will happen? This will print 10 and returns 8, but I do nothing with 8
        cal.giveBackSomething();

        // how about this?
        System.out.println(cal.giveBackSomething());

        cal.doNotReturnAnything();

        System.out.println("The avg of 32,12, and 55 is " + cal.avg(32, 12, 55));

        String result4 = cal.returnString(99);
        System.out.println(result4);

    }

}
