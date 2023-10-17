package inheritance.children;

import inheritance.parent.Animal;

public class Cat extends Animal {
    @Override
    public String move() {
        return "Cat moves";
    }
}
