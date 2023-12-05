package exercises;

import java.io.*;
import java.util.Scanner;


public class Exercise42 {


    public static void main(String[] args) {

//        readAndWrite();
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String inputFileName = "input.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName));
            writer.write(line);
            writer.close();

        } catch (IOException e) {
            System.out.println("Unable to read file: " + inputFileName);
        }

        readAndDisplay(inputFileName);

    }

    private static void readAndDisplay(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            reader.close();
            System.out.println(currentLine);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + fileName);
        }

    }

    private static void readAndWrite() {
        String file = "fileTest.txt";
        String file2 = "fileTest2.txt";
        String str1 = "Hello";
        String str2 = "World";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str1);
            writer.append(' ');
            writer.append("\n");
            writer.append(str2);

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file2));
            String currentLine1 = reader.readLine();
            String currentLine2 = reader.readLine();
            reader.close();


            System.out.println(currentLine1 + currentLine2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file);
        }
    }


}

