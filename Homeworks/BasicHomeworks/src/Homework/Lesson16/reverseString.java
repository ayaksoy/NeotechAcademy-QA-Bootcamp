package Homework.Lesson16;

public class reverseString {
    public static void main(String[] args) {
//        Write a program to print out the following conversion:
//        Today is Tuesday and we have a Java Class!!!  to
//        yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
//        You can use any other string as long as the format is correct.

        String str = "Today is Tuesday and we have a Java Class!!!";
        System.out.println(str);

        String[] sentence = str.split(" ");
        StringBuffer reversedString = new StringBuffer();
        String finall = "";

        for (String word : sentence) {
            StringBuffer reverse = new StringBuffer(word);
            finall += reverse.reverse() + " ";
        }
        System.out.println(finall);
    }
}
