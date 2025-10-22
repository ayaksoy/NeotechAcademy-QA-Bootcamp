import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows
        //Write your code below
        int biggest = findBiggest(arr);

        System.out.println(Arrays.deepToString(replace(arr, biggest)));
    }

    static int findBiggest(int[][] arr) {
        int result = arr[0][0];
        for (int[] i : arr)
            for (int j : i)
                if (j > result)
                    result = j;
        return result;
    }

    static int[][] replace(int[][] arr, int num) {
        for (int[] i : arr)
            Arrays.fill(i, num);
        return arr;
    }
}