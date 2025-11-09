package NeotechCoding;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char[] characters = word.toCharArray();

        for (char character : characters) {
            if (isVowel(character))
                System.out.print(character);
        }

    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
