package lesson26;

public class Main {
    public static void main(String[] args) {
        Registration reg = new Registration();
        reg.setUserName("Wu");
        reg.setUserName("MethodMan");

        reg.setPassword("MethodMan123");
        reg.setPassword("M123");
        reg.setPassword("Metho123");

        reg.setEmail("methodman@gmail.com");
        reg.setEmail("methodman@yahoo.com");

        System.out.println("\n\nRegistration Details:");
        System.out.println("UserName: " + reg.getUserName());
        System.out.println("Password: " + reg.getPassword());
        System.out.println("Email: " + reg.getEmail());


    }
}
