package lesson30;

import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {
    public static void main(String[] args) {
//        TreeMap ; enteries will be ordered ASC according to key

        Map<String, Integer> groceries = new TreeMap<>();

        groceries.put("Milk", 1);
        groceries.put("Bread", 2);
        groceries.put("Eggs", 12);
        groceries.put("Cookies", 3);
//        groceries.put(null, 4); run time error / NullPointerException
        groceries.remove("Cookies");

        System.out.println(groceries);


    }
}
