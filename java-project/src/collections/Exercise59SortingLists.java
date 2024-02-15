package collections;

import java.util.*;

public class Exercise59SortingLists {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Snake");
        animals.add("Fly");
        animals.add("Lion");

        Collections.sort(animals);


        for (String animal : animals) {
            System.out.println(animal);
        }

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
        Collections.sort(numbers);

        for (Integer number : numbers) {
            System.out.println(numbers);
        }

        Collections.sort(animals, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }
}