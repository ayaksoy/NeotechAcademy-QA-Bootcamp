package NeotechCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {
    // Write your return method here. It should return Boolean and having three parameters
    public static boolean nanuk(ArrayList<String> list, int stones, int boast) {
        int total = 0;
        for (String waypoint : list) {
            if (waypoint.contains("nanuk"))
                if (stones-- > 0)
                    continue;
                else
                    return false;
            total += Integer.parseInt(waypoint);
        }

        return total >= boast;

    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }
        System.out.println(nanuk(list, stones, boast));
    }
}