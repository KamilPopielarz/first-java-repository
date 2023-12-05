package exercises;

import java.io.*;
import java.util.Scanner;


public class Exercise42 {


    public static void main(String[] args) {

//        readAndWrite();
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        String inputFileName = "input.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName));
            scanner.nextLine();
            for (int i = 0; i < numberOfLines; i++) {
                String line = scanner.nextLine();
                writer.write(line);
                writer.append("\n");
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Unable to read file: " + inputFileName);
        }

        readAndDisplay(inputFileName, numberOfLines);

    }

    private static void readAndDisplay(String fileName, int numberOfLines) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            for (int i = 0; i < numberOfLines; i++) {
                String currentLine = reader.readLine();
                System.out.println(currentLine);
            }
            reader.close();
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

