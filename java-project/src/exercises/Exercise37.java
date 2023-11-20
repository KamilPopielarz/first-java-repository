package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "X:\\IntelliJ IDEA 2023.2.2\\example.txt";
        File textFile = new File(fileName);
        Scanner in = new Scanner(textFile);


        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();

        int count = 2;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }

        in.close();

    }


}
