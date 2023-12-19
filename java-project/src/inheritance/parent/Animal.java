package inheritance.parent;

public class Animal {
    private boolean canFly;
    private boolean canSwim;
    private boolean canRun;

    private String name;

    public Animal() {

    }


    public Animal(boolean canFlyFromConstructor, boolean canSwimFromConstructor, boolean canRunFromConstructor) {
        this.canFly = canFlyFromConstructor;
        this.canSwim = canSwimFromConstructor;
        this.canRun = canRunFromConstructor;
    }


    public String move() {
        return "Animal moves";
    }

    public boolean canFly() {
        return this.canFly;
    }

    public boolean canRun() {
        return this.canRun;
    }

    public boolean canSwim() {
        return this.canSwim;
    }


    protected String giveSound() {
        return "Animal gives sound";
    }

    protected void jump() {
        System.out.println("Animal jumps");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
