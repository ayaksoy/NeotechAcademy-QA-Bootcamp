package NeotechCoding;

import java.util.Scanner;

public class Cat_And_Dog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int countOfCats = 0;
        int countOfDogs = 0;
        int indexOf = 0;

        while (true) {
            if (word.indexOf("cat", indexOf) == -1)
                break;
            indexOf = word.indexOf("cat", indexOf) + 1;
            countOfCats++;
        }
        indexOf = 0;
        while (true) {
            if (word.indexOf("dog", indexOf) == -1)
                break;
            indexOf = word.indexOf("dog", indexOf) + 1;
            countOfDogs++;
        }

        if (countOfCats == countOfDogs)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
