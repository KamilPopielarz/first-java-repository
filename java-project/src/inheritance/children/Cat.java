package inheritance.children;

import inheritance.parent.Animal;

public class Cat extends Animal {

    public Cat(){
        super(false, false,true);
    }
    @Override
    public String move() {
        return "Cat moves";
    }
}
