package lesson27;

import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Ahmet");
        list.add("Halil");
        list.add("Mercy");
        list.add("Ozzy");
        list.add("Cem");
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Halil"));
        System.out.println(list.size());
        System.out.println(list);


    }
}
