package com.epam.automation.input.optional3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) throws IOException {
        File path = new File("d:/Java/collections/collections/src/main/java/com/epam/automation/input/optional2/HelloWorld.java");
        FileReader fr = new FileReader(path);
        Scanner scanner = new Scanner(fr);
        PrintWriter pw = new PrintWriter("d:/Java/collections/collections/src/main/java/com/epam/automation/input/optional3/reverseOrderFile");
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            char lineArray[] = line.toCharArray();
            for (int i = lineArray.length - 1; i > 0; i--) {
pw.write(lineArray[i]);
            }
            pw.println();
        }
        pw.close();
        scanner.close();
    }
}
