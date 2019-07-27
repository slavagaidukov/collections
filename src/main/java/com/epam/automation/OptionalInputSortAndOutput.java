package com.epam.automation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OptionalInputSortAndOutput {


    public static void main(String[] args) throws FileNotFoundException {
        String path = "d:/Java/collections/collections/poem";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> linesFromFile = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            linesFromFile.add(line);
        }
        scanner.close();
        Collections.sort(linesFromFile, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


    }

}