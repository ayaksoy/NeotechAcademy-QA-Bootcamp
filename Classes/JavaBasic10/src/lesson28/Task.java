package lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.endsWith("e"))
                list.remove(i--);
        }
        System.out.println(list);


        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String word = it.next();
            if (word.charAt(word.length() - 1) == 'e')
                it.remove();
        }
        System.out.println(list);

    }
}
