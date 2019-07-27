package com.epam.automation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class OptionalParentheses {
    public static void main(String[] args) {
        parenthesesAreCorrect();
    }

    public static void parenthesesAreCorrect() {
        Stack<Character> parentheses = new Stack<>();
        String file = "d:/Java/collections/collections/parentheses";
        File f = new File(file);
        int b;
        FileReader is = null;
        try {
            is = new FileReader(f);
            while ((b = is.read()) != -1) {
                System.out.print((char) b);
                parentheses.push((char) b);
            }
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e);
        }
        int initialStackSize = parentheses.size();
        boolean parenthesesAreCorrect = true;
        for (int i = 0; i < initialStackSize / 2; i++) {
            char temp = parentheses.pop();
            char previous = parentheses.pop();
            switch (temp) {
                case '}':
                    if (previous != '{') {
                        parenthesesAreCorrect = false;
                    }
                    break;
                case ')':
                    if (previous != '(') {
                        parenthesesAreCorrect = false;
                    }
                    break;
                case ']':
                    if (previous != '[') {
                        parenthesesAreCorrect = false;
                    }
                    break;
                default:
                    parenthesesAreCorrect = false;
            }

        }
        System.out.println("Parentheses are correct - " + parenthesesAreCorrect);
    }
}

