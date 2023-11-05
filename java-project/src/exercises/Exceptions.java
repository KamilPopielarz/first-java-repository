package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 2, 3};
        System.out.println(array[2]);
//        Person person = new Person();
//        System.out.println(person.name.length());
//        System.out.println(3 / 0);
        extracted();
    }

    private static void extracted() throws IOException {
        String expected_value = "Hello, world!";
        String file = "/fileTest.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();
    }
}
