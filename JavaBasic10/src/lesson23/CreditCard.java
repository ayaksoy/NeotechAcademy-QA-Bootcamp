package lesson23;

public class CreditCard {
//    Homework 1:
//            ▪ Create a class CreditCard and define two variables, balance and interest.
//            ▪ Create an instance method that will calculate the interest based on the given balance.
//            ▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
//            ▪ Call the method by creating an object of each of the three classes.

    double balance, interest;

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.balance = 1000;
        creditCard.calculateInterest();
        Visa visa = new Visa();
        visa.balance = 1000;
        visa.calculateInterest();
        AX ax = new AX();
        ax.balance = 1000;
        ax.calculateInterest();

    }

    void calculateInterest() {

        interest = balance * 0.15;
        System.out.println("Credit Card Interest: " + interest);
    }
}

class Visa extends CreditCard {

}

class AX extends CreditCard {
    void calculateInterest() {

        interest = balance * 0.25;
        System.out.println("AX Credit Card Interest: " + interest);
    }
}
