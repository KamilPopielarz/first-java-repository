package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise62 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Lemon");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
            // Można tutaj również usunąć element
            // it.remove();
            if(element.equals("Banana")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
