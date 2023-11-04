package inheritance.children;

import inheritance.parent.Animal;

public class Fish extends Animal {

    public Fish(){
        super(false, true,false);
    }

    @Override
    public String move() {
        return "Fish swim";
    }
}
