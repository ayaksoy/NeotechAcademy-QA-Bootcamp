package NeotechCoding;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int count = 0, indexOf = 0;

        while (true) {
            if (word.indexOf("java", indexOf) == -1)
                break;
            indexOf = word.indexOf("java", indexOf) + 1;
            count++;
        }
        System.out.println(count);

    }
}

