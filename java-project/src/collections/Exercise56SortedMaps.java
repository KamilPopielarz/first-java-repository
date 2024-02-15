package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise56SortedMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(hashMap);
        System.out.println("_________________");
        testMap(linkedHashMap);
        System.out.println("_________________");
        testMap(treeMap);


    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "giraffe");
        map.put(8, "cat");
        map.put(2, "dog");
        map.put(1, "snake");
        map.put(15, "beer");
        map.put(6, "ant");
        map.put(0, "fly");

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
