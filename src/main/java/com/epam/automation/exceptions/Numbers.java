package com.epam.automation.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    private ArrayList<String> listOfStrings = new ArrayList<>();
    private ArrayList<Double> listOfDoubles = new ArrayList<>();

    public void readNumbers(){
        String path = "d:/Java/collections/collections/numbers";
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("The file was not found");
        }
        while (scanner.hasNextLine()) {
            try {
                String line = scanner.nextLine();
                listOfStrings.add(line);
            } catch (OutOfMemoryError e) {
                System.err.println("The file is too large");
            }
        }
        scanner.close();
    }

    public void outputListOfStrings() {
        System.out.println(listOfStrings);
    }

    public void convertToDouble() throws NumberOutOfBoundsException {
        for (String num : listOfStrings) {
            try {
                double number = Double.parseDouble(num);
                if (!isNumberCorrect(number)) throw new NumberOutOfBoundsException("The value of number is out of valid range");
                listOfDoubles.add(number);
            } catch (NumberFormatException e) {
                System.err.println("Error in parsing");
            }
        }
    }

    // The method compare the value of number to maximal and minimal values of Double. If the number is out of range, the method return 0.
    public static boolean isNumberCorrect(double number) {
        if (number >= Double.MAX_VALUE || number <= Double.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public void outputListOfDoubles() {
        System.out.println(listOfDoubles);
    }

    public void calculateSum() {
        double sum = 0;
        for (Double num : listOfDoubles) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void calculateAverageValue() {
        double average = 0;
        double sum = 0;
        for (Double num : listOfDoubles) {
            sum += num;
        }
        average = sum / listOfDoubles.size();
        System.out.println(average);
    }
}
