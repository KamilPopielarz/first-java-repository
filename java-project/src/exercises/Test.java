package exercises;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
