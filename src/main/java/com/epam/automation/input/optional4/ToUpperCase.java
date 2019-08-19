package com.epam.automation.input.optional4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) throws IOException {
        File path = new File("d:/Java/collections/collections/src/main/java/com/epam/automation/input/optional2/HelloWorld.java");
        FileReader fr = new FileReader(path);
        Scanner scanner = new Scanner(fr);
        PrintWriter pw = new PrintWriter("d:/Java/collections/collections/src/main/java/com/epam/automation/input/optional4/toUpperCaseFile");
        String line;
        String[] wordsArray;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            wordsArray = line.split(" ");
            for (int i = 0; i < wordsArray.length; i++) {
                if (wordsArray[i].length() > 2) {
                    wordsArray[i] = wordsArray[i].toUpperCase();
                }
                pw.print(wordsArray[i] + " ");
            }
            pw.println();
        }
        pw.close();
        scanner.close();
    }
}
