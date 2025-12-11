package lesson14;

public class PhoneStore {

    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.brand = "Apple";
        iPhone.model = "17 Pro Max";
        iPhone.color = "White";
        iPhone.price = 1200;

        iPhone.call();
        iPhone.text();
        iPhone.navigate();

        System.out.println("-----------");

        Phone android = new Phone();
        android.brand = "Samsung";
        android.model = "S25";
        android.color = "Black";
        android.price = 800;

        android.call();
        android.text();
        android.navigate();

        System.out.println("-----------");

        Phone nokia = new Phone();
        nokia.brand = "Nokia";
        nokia.model = "3210";
        nokia.color = "Grey";
        nokia.price = 200;

        nokia.call();
        nokia.text();
        nokia.navigate();

    }

}
