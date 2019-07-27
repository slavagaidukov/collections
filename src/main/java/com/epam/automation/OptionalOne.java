package com.epam.automation;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class OptionalOne {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "d:/Java/collections/collections/data";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> linesFromFile = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            linesFromFile.add(line);
        }
        scanner.close();

        File file1 = new File("output");
        PrintWriter pw = new PrintWriter(file1);
        for (int i = linesFromFile.size() - 1; i >= 0; i--) {
            pw.println(linesFromFile.get(i));
        }
        pw.close();
    }
}











