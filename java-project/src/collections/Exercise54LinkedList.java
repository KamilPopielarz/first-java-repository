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

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList1);
        doTimings("LinkedList", linkedList1);

    }
    private static void doTimings(String type, List<Integer> list){
        /*
        for(int i=0; i<1E5; i++){
            list.add(i);
        }
        */
        for(int i=0; i<1E5; i++){
            list.add(list.size(), i);
        }


        long start = System.currentTimeMillis();

        for(int i=0; i<1E5; i++){
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: "+ (end - start) + " ms for " + type);
    }
}
