package com.epam.automation;

import java.util.Scanner;
import java.util.Stack;

public class OptionalTwo {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            stack.push(digits[i]);
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits[i]);
            stack.pop();
        }
    }
}
