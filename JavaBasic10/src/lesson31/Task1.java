package lesson31;

import java.util.*;
import java.util.Map.Entry;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> cities = new TreeMap<>();

        cities.put("Paris", 5);
        cities.put("Moscowww", 6);
        cities.put("Washington DC", 13);
        cities.put("Ankara", 5);
        cities.put("Erbil", 7);

//        Set<Map.Entry<String, Integer>> setCities = cities.entrySet();
//
//        for (Map.Entry<String,Integer>city : setCities)
//            if(city.getKey().length() > 7)
//        use iterator cuz of remove;

        Iterator<Entry<String, Integer>> it = cities.entrySet().iterator();

        while (it.hasNext()) {
            Entry<String, Integer> entry = it.next();

            if (entry.getKey().length() > 7)
                it.remove();
        }
        System.out.println(cities);

        List<Map<Integer, String>> asd = new ArrayList<>();

    }
}
