import java.util.ArrayList;
import java.util.Scanner;

public class Temp {
    // Create your method below

    private static ArrayList<Integer> timesTwo(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i) * 2);
        return list;
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(timesTwo(list));
    }


}