public class Temp {
    Temp(int a) {
        System.out.println("Temp constructor");
    }

    public static void main(String[] args) {
        b obj = new b(2);
    }
}

class b extends Temp {
    b(int a) {
        super(a);
        System.out.println("B constructor");
    }
}