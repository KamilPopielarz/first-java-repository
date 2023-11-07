package exercises;

import exercises.exceptions.CustomIOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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

    private static void extracted() {
        String expected_value = "Hello, world!";
        String file = "/fileTest.txt";

        extracted2(file);

//        String currentLine = reader.readLine();
//        reader.close();
    }

    private static void extracted2(String file) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                throw new CustomIOException(e.getMessage());
            }
        }
    }
}
