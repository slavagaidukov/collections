package com.epam.automation.exceptions;


public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.readNumbers();
        numbers.outputListOfStrings();
        try {
            numbers.convertToDouble();
        } catch (NumberOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        numbers.outputListOfDoubles();
        numbers.calculateSum();
        numbers.calculateAverageValue();
    }
}
