package inheritance.children;

import inheritance.parent.Animal;

public class Dog extends Animal {

    public Dog() {
        super(false, false, true);
    }

    @Override
    public String move() {
        return "Dog moves";
    }

    public String poke() {
        return super.giveSound();
    }

}
