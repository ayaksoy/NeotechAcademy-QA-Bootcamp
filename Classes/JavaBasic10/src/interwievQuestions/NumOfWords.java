package interwievQuestions;

public class NumOfWords {
    public static void main(String[] args) {
        String str = "as7d2t 64uyl4 1asy";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
                count++;
        }
        System.out.println(count);

        String[] arr = str.split(" ");
        System.out.println(arr.length);
    }
}
