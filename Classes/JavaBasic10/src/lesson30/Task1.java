package lesson30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> building = new HashMap<>();

        building.put(1, "Google");
        building.put(2, "Apple");
        building.put(3, "NeoTech");
        building.put(4, "Abc");
        building.put(5, "Cnn");
        building.put(6, "Google");
        building.put(null, "OpenAi");

        System.out.println(building);
        System.out.println("Total Entry = " + building.size());

        building.replace(4, "BCA");
        building.remove(3);
        System.out.println(building);

    }
}
