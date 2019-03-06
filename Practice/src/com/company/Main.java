package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(4);



        //mystery1(list);
        //mystery2(list);
        //mystery3(list);
        mystery4(list);
    }
    public static void mystery1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }
        }
        System.out.println(list);
    }
    public static void mystery2(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.add(list.get(i));
            } else {
                list.add(0, list.get(i));
            }
        }
        System.out.println(list);
    }
    public static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i + 1);
            list.set(i, a + b);
        }
        System.out.println(list);
    }

    public static void mystery4(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }
}
