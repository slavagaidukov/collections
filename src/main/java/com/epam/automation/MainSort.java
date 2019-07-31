package com.epam.automation;

import java.util.ArrayList;

public class MainSort {
    public static void main(String[] args) {
        arrayListSwap();
    }

    public static void arrayListSwap() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-1);
        list.add(-4);
        list.add(8);
        list.add(-2);
        list.add(4);

        for (int i = list.size()-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j+1)) {
                    list.set(j, list.get(j) + list.get(j+1));
                    list.set(j+1, list.get(j) - list.get(j+1));
                    list.set(j, list.get(j) - list.get(j+1));
                }
            }
        }
        System.out.println(list);
    }
}