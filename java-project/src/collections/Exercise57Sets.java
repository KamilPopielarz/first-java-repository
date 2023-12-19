package collections;

import inheritance.children.Dog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise57Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set);

        Set<Dog> dogs = new HashSet<>();
        Dog dog1 = new Dog();
        dog1.setName("Burek");
        dogs.add(dog1);
        System.out.println(dogs);
        System.out.println(dog1.hashCode());

        Dog dog2 = new Dog();
        System.out.println("HashCode przed nadaniem imienia: " + dog2.hashCode());
        dog2.setName("Burek");
        System.out.println("HashCode po nadaniu imienia: " + dog2.hashCode());

        dogs.add(dog2);
        System.out.println(dogs);

        System.out.println(dog1.equals(dog2));

        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Ewelina");
        names.add("Kuba");
        names.add("Kuba");

        Set<String> namesSet = new HashSet<>(names);
        System.out.println("Names: " + names);
        System.out.println("NamesSet: " + namesSet);


    }
}
