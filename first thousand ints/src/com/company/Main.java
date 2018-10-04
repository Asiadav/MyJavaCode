package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == i % 20) {
                for (int x = 1; x <= i % 10; x++) {
                    System.out.print(" ");
                }

            } else {
                for (int x = 9; x >= i % 10; x--) {
                    System.out.print(" ");
                }
            }
            System.out.println(i);

        }
    }
}

