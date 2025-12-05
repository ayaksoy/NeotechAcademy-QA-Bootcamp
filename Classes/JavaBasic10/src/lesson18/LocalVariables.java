package lesson18;

public class LocalVariables {
    public static void main(String[] args) {
        boolean flag = true;

        if (flag) {
            System.out.println("yes");
            System.out.println(flag);
            boolean flag2 = false;
        }
        System.out.println(flag);
    }
}
