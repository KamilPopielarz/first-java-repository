package collections;

import java.util.*;

class Person2 implements Comparable<Person2>{
    private String name;

    public Person2(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Person2 o) {
        return 0;
    }
}


public class Exercise60NaturalOrdering {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<Person2>();
        SortedSet<Person2> set = new TreeSet<Person2>();

        addElements(list);
        addElements(set);

       Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);

        

    }


    private static void addElements(Collection<Person2> name) {
        name.add(new Person2("Joe"));
        name.add(new Person2("Susan"));
        name.add(new Person2("Gregory"));
        name.add(new Person2("Wilson"));
        name.add(new Person2("Josh"));
    }
    private static void showElements(Collection<Person2> name) {
        for(Person2 element: name){
            System.out.println(element);
        }
    }

}
