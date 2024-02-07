package collections;

import inheritance.children.Dog;

import java.util.*;

public class Exercise57Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set);

        Set<Dog> dogs = new HashSet<>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog3.setName("Maks");
        dog1.setName("Murek");
        dog2.setName("Bops");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);
        System.out.println(dog1.hashCode());
        Iterator<Dog> dogsInterator = dogs.iterator();
        while (dogsInterator.hasNext()) {
            System.out.println("Iterator: " + dogsInterator.next());
        }
        Dog m = dogs.stream().filter(dogInsideStream -> dogInsideStream.getName().charAt(0) == 77).findAny().get();
        System.out.println(m);
        List<String> strings = dogs.stream().map(dogInsideStream -> dogInsideStream.move()).toList();
        System.out.println(strings);
        Dog dog4 = new Dog();
        System.out.println("HashCode przed nadaniem imienia: " + dog4.hashCode());
        dog4.setName("Burek");
        System.out.println("HashCode po nadaniu imienia: " + dog4.hashCode());

        dogs.add(dog4);
        System.out.println(dogs);

        System.out.println(dog1.equals(dog4));

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
