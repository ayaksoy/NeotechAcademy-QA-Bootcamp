package lesson16;

import java.util.Scanner;

public class Homework1 {

	/*
	 	Create a method createEmail(). Based on provided users firstName, 
	 	lastName and emailType, your method should return complete 
	 	email address.
	 	
		Example: 
		firstName -> john
		lastName -> snow
		emailType -> gmail
		return -> johnsnow@gmail.com

	 */


    // a class is a template/blueprint

    //features (variables)


    //behaviors (methods)


    //what is a method???


    //return type {ex: void, String, int, Student }
    // methodName(input parameters)
    // { ...code...
    //   ...code...
    //  	if we have to, we can return something here..depends on the return type
    //	}


    public static void main(String[] args) {

        //DataType identifier assignment operator (=) new DataType();

        //for primitive types:
        // dataType name = value;


        Homework1 hw = new Homework1();

        String myEmail = hw.createEmail("sabah", "bushaj", "gmail");
        System.out.println("My email: " + myEmail);

        //we can also get the values from a scanner

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = scan.next();

        System.out.println("Enter you last name: ");
        String lastName = scan.next();

        System.out.println("Enter your email type: ");
        String emailType = scan.next();

        String fullEmail = hw.createEmail(name, lastName, emailType);

        System.out.println("Your email is: " + fullEmail);

    }

    /**
     * This method will get the parameters below and return a full email address.
     *
     * @param firstName
     * @param lastName
     * @param emailType
     * @return fullEmail
     */
    String createEmail(String firstName, String lastName, String emailType) {

        String email = firstName + lastName + "@" + emailType + ".com";

        //I must return (send back) the full email as a String type
        return email;


        //if the method process is something short, I can immediately return the result
        //	return firstName + lastName + "@" + emailType + ".com";

    }


}
