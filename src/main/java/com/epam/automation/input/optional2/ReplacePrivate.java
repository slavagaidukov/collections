package com.epam.automation.input.optional2;

import java.io.*;
import java.util.Scanner;

public class ReplacePrivate {
    public static void main(String[] args) throws IOException {
        File path = new File("d:/Java/collections/collections/src/main/java/com/epam/automation/input/optional2/HelloWorld.java");
        FileReader fr = new FileReader(path);
        Scanner scanner = new Scanner(fr);
        PrintWriter pw = new PrintWriter ("d:/Java/collections/collections/src/main/java/com/epam/automation/input/optional2/HelloWorldPrivate.java");
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            pw.println (line.replace("public","private"));
        }
        pw.close();
        scanner.close();
    }
}

