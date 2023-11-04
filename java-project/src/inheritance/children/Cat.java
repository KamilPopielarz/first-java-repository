package inheritance.children;

import inheritance.parent.Animal;

public class Cat extends Animal {

    public Cat() {
        super(false, false, true);
    }

    @Override
    public String move() {
        return "Cat moves";
    }

    @Override
    public boolean equals(Object obj) {
        Cat otherCat = (Cat) obj;
        return this.canFly() == otherCat.canFly();

    }
}
