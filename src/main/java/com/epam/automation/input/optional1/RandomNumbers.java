package com.epam.automation.input.optional1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("outputRandom");
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < 5; i++) {
            pw.println((int) (Math.random() * 10));
        }
        pw.close();
        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            list.add(number);
        }
        scanner.close();
        System.out.println("Before Sort :" + list);
        Collections.sort(list);
        System.out.println("After Sort :" + list);

        PrintWriter pwAfterSort = new PrintWriter(file);
        for (String element : list) {
            pwAfterSort.println(element);
        }
        pwAfterSort.close();
    }
}

