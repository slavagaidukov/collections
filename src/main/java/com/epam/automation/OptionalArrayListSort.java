package com.epam.automation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class OptionalArrayListSort {
    public static void main(String[] args) {
        methodWithCompareSort();
        arrayListSortWithSwap();

    }

    public static void methodWithCompareSort() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(-5);
        numbers.add(-7);
        numbers.add(-4);
        numbers.add(-2);
        numbers.add(1);
        numbers.add(-10);
        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1 + o2;
            }
        });
        System.out.println(numbers);
    }

    public static void arrayListSortWithSwap() {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(-5);
        numbers1.add(-7);
        numbers1.add(-4);
        numbers1.add(-2);
        numbers1.add(1);
        numbers1.add(-10);
        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(i) < 0) {
                numbers1.add(numbers1.size()-1, numbers1.get(i));
                numbers1.remove(i);
            }
        }
        System.out.println(numbers1);
    }
}

