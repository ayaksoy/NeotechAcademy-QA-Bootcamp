import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Temp {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        // complete the method
        String temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);

        return list;
    }

    // Do not touch below
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        int sum = 0;
        for (Integer key : map.values()) {
            sum += key;
        }
        System.out.println(sum);
    }
}