package lesson30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("France", "Paris");
        countries.put("Kosovo", "Prishtina");
        countries.put("Turkey", "Ankara");
        countries.put("USA", "Washington DC");
        countries.put("Albania", "Tirana");
        countries.put("Italy", "Rome");

        System.out.println(countries);
        System.out.println(countries.containsKey("Albania"));
        System.out.println(countries.containsKey("Turkey"));
        System.out.println(countries.containsValue("Ankara"));

        Set<String> cnt = countries.keySet();

        for (String country : cnt)
            System.out.println(country);

        Iterator<String> capitals = countries.values().iterator();

        while (capitals.hasNext()) {
            String capital = capitals.next();
            System.out.println(capital);
        }


    }
}
