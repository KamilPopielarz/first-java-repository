package inheritance.children;

import inheritance.parent.Animal;

public class Bird extends Animal {
    private int age;
    private String name;

    public Bird(int age, String name) {
        super(true, false, false);
        this.age = age;
        this.name = name;
    }

    @Override
    public String move() {
        return "Bird flies";
    }

    @Override
    public String toString() {
        return "bird can fly:" + canFly();
    }

    @Override
    public int hashCode() {
        char[] chars = this.name.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum = sum + chars[i];
        }

        int hashCode = this.age+ this.name.length() + sum;
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        Bird otherBird = (Bird) obj;
        return this.age == otherBird.age && this.name.equals(otherBird.name);
    }


}


