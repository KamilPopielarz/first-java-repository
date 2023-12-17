package collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise55HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "Kamil");
        map.put(30, "Adam");
        map.put(22, "Maja");
        map.put(27, "Janek");
        map.put(null, "Tomek");
        String value = map.get(null);
        System.out.println(value);

        Map<String, String> map1 = new HashMap<>();
        map1.put("Kamil", "Popielarz");
        map1.put("Kamil", "Nowak");
        String lastName = map1.get("Kamil");
        System.out.println(lastName);

        System.out.println(map.containsKey(43));

        boolean cv = map.containsValue("Kamil");
        System.out.println(cv);

        for (Map.Entry<Integer, String> keyValueNode : map.entrySet()) {
            if (keyValueNode.getValue().equals("Kamil")) {
                System.out.println(keyValueNode.getKey());
            }
        }

        System.out.println(map.containsValue("Maja"));
        map.replace(23, "Adam");
        System.out.println(map.get(23));
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
