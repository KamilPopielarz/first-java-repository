package collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise53ArrayList {
    public static void main(String[] args) {
//        Object[] array = {1, "String", 3};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);  // index 0
//        arrayList.add(2);  // index 1
//        arrayList.add(3);  // index 2
//        for(int i = 0; i<arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }

        List<String> strings = List.of("Adam", "Maja", "Maciek", "Jacek");
        ArrayList<String> names = new ArrayList<>(strings);
        if(names.contains("Kamil")){
            System.out.println("Kamil is placed at index: " + names.indexOf("Kamil"));
        }else{
            System.out.println("There is not such a name");
        }
        System.out.println(names);
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names);
        names.remove("Maja");
        System.out.println(names);
        System.out.println(names.size());

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));
        System.out.println("Pierwsza metoda: ");
        for(int i=0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("Druga metoda: ");
        for(Integer value: numbers){
            System.out.println(value);
        }

        numbers.remove(numbers.size() -1);

        numbers.remove(0);


    }
}
