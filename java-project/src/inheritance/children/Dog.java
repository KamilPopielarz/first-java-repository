package inheritance.children;

import inheritance.parent.Animal;

public class Dog extends Animal {

    public Dog() {
        super(false, false, true);
    }

    @Override
    public String move() {
        return getName() + " moves";
    }

    public String poke() {
        return super.giveSound();
    }

    @Override
    public int hashCode() {
        if (getName() == null) {
            return 0;
        }
        return this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Dog otherDog = (Dog) obj;
        return this.getName().equals(otherDog.getName());
    }
}
