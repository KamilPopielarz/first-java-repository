package inheritance.children;

import inheritance.parent.Animal;

public class Bird extends Animal {

    public Bird() {
        super(true, false, false);
    }

    @Override
    public String move() {
        return "Bird flies";
    }

    @Override
    public String toString() {
        return "bird can fly:" + canFly();
    }
}


