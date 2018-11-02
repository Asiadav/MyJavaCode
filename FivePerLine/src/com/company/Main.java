package com.company;

public class Main {

    public static int rangeLow = 1000;
    public static int rangeHi = 2000;

    public static void main(String[] args) {
        for(int line = rangeLow ; line <= rangeHi-5; line += 5){
            for(int i = line; i <= line + 4; i ++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
