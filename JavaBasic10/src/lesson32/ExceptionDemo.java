package lesson32;

public class ExceptionDemo {
    public static void main(String[] args) {
        divide(6, 3);
        divide(7, 0);
        divide(16, 4);
    }

    static void divide(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (Exception ex) {
            System.out.println("problem!");
            System.out.println("exception = " + ex);
            System.out.println("exception message = " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Neotech is best");
        }
    }
}
