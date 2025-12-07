package NeotechCoding;

import java.util.Scanner;

public class Alejandro_II {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //your code here
        String eMail = s.next();

        if (eMail.contains("project") && eMail.contains("alejandro"))
            System.out.println("read");
        else
            System.out.println("don't read");

    }
}
