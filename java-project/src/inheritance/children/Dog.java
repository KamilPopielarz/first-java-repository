package inheritance.children;

import inheritance.parent.Animal;

public class Dog extends Animal {
    @Override
    public String move() {
        return "Dog moves";
    }
}
