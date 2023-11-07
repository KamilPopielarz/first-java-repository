package exercises;

public class Exercise30 {
    public static void main(String[] args) {
    Plant plant = new Plant();
    Tree tree = new Tree();

    Tree tree2 = tree;
    Plant plant2 = new Tree();

    plant2.grow();
    tree2.grow();

    }
}
