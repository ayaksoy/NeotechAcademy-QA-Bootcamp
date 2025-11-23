package lesson30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {
    public static void main(String[] args) {
        Map<String, Integer> cars = new LinkedHashMap<>();
        cars.put("BMW", 2);
        cars.put("Mercedes", 1);
        cars.put("Audi", 1);
        cars.put("Ferrari", 3);
        System.out.println(cars.size());
        System.out.println(cars);

        cars.replace("Audi", 5);
        System.out.println(cars);

        cars.put("Honda", 5);
        System.out.println(cars);

        System.out.println(cars.get("Ferrari"));

        System.out.println(cars.containsKey("Honda"));

        cars.remove("Mercedes");
        System.out.println(cars);

        Set<String> models = cars.keySet();

        for (String model : models)
            System.out.println(model);

    }
}
