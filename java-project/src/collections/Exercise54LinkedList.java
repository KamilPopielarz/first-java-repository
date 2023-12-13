package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise54LinkedList {
    public static void main(String[] args) {

        List<String> strings = List.of("Adam", "Maja", "Maciek", "Jacek");
        List<String> arrayList = new ArrayList<>(strings);
        List<String> linkedList = new LinkedList<>(strings);
//        linkedList.add("Adam");
//        linkedList.add("Maja");
//        linkedList.add("Maciek");
//        linkedList.add("Jacek");
        boolean equals = linkedList.equals(arrayList);
        System.out.println(equals);

    }
}
