package lesson28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> asia = new LinkedList<>(); // Up-casting
        asia.add("China");
        asia.add("Turkiye");
        asia.add("Japan");
        asia.add("Mongolia");
        asia.add("China");
        asia.add("India");
        asia.add("Japan");
        System.out.println("asia →>" + asia);
        // Task
        // Iterate the Asia list and remove duplicates
        // hint: you can create a new List, add the elements one by one
        // but first check if the new list CONTAINS the country

        Iterator<String> it = asia.iterator();
        List<String> newList = new ArrayList<>();

        while (it.hasNext()) { // pointer < it
            String word = it.next();

            System.out.println(word);
        }
        System.out.println(newList);


    }
}
