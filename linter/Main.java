// package com.company;
import java.io.*;
import java.lang.invoke.WrongMethodTypeException;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {

    public static void fileReader(String filename) {
        File file = new File("com/company/gates.js");
        Path path = Paths.get(filename + ".txt");

        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            while (true) {
               if(Pattern.compile(";$") == Pattern.compile(line))
                System.out.println("WrongTypeException");

                line = reader.readLine();
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Program executed");
        }
    }



    public static void fileResourceFolder() {
        File file = new File("com/company/gates.js");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }

    public static void main(String[] args) {
        fileReader("gates.js");
    }
}

