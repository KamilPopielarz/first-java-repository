package exercises;

import java.io.*;


public class Exercise42 {


    public static void main(String[] args) throws IOException {

        String file = "fileTest.txt";

        String str1 = "Hello";
        String str2 = "World";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(str1);
        writer.append(' ');
        writer.append("\n");
        writer.append(str2);

        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine1 = reader.readLine();
        String currentLine2 = reader.readLine();
        reader.close();

        System.out.println(currentLine1 + currentLine2);


    }
}
