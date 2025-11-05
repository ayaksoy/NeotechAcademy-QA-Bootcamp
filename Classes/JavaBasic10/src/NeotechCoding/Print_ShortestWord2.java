package NeotechCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Print_ShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        //Write your code here

        String[] words = str.split("_");
        int shortest = words[0].length();

        for (String word : words)
            if (shortest > word.length())
                shortest = word.length();

        for (String word : words)
            if (shortest == word.length())
                count++;
        String[] ret = new String[count];
        int i = 0;
        for (String word : words)
            if (word.length() == shortest)
                ret[i++] = word;

        System.out.println(Arrays.toString(ret));


    }
}