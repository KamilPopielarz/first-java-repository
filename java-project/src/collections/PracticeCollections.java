package collections;

import java.lang.reflect.Array;
import java.util.*;

public class PracticeCollections {
    public static void main(String[] args) {

        String[] names = {"Adam", "Kamil", "Jacek", "Anita"};
        System.out.println(Arrays.toString(names));

        List<String> otherNames = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            otherNames.add(names[i]);
        }
        System.out.println(otherNames);

        Set<String> differentNames = new HashSet<>();

        for (int i = 0; i < names.length; i++) {   // i != 4
            if (!names[i].startsWith("A")) {
                differentNames.add(names[i]);
            }
        }
        System.out.println(differentNames);

        Map<Integer, String> familyMap = new HashMap<>();

        int[] ages = {32, 23, 57, 55, 83};
        for (int i = 0; i < ages.length && i < names.length; i++) {
            familyMap.put(ages[i], names[i]);
        }
        System.out.println(familyMap);


    }
}
