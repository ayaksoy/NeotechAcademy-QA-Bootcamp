import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        //Write your code here
        String[] words = str.split("_");
        int shortest = words[0].length();

        for (String word : words)
            if (word.length() < shortest)
                shortest = word.length();

        for (String word : words)
            if (word.length() == shortest)
                count++;

        String[] arr = new String[count];
//        int i = 0;
//        for (String word : words)
//            if (word.length() == shortest)
//                arr[i++] = word;
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == shortest) {
                arr[j] = words[i];
                ++j;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();


    }
}