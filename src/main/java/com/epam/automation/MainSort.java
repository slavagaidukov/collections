package com.epam.automation;

import java.util.ArrayList;

public class MainSort {
    public static void main(String[] args) {
        arrayListCircle();
    }

    public static void arrayListCircle() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        for (int i = 1; i < list.size() -1; ++i) {
            for (int j = list.size() - 2; j >= i; --j) {
                if (list.get(j - 1) > list.get(j)) {
                    list.set(j - 1, list.get(j - 1) + list.get(j));
                    list.set(j, list.get(j - 1) - list.get(j));
                    list.set(j - 1, list.get(j - 1) - list.get(j));
                }
            }
        }
        System.out.println(list);
    }
}

