package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static double convertFToC(double degree) {
        //System.out.println((degree - 32) * (5.0/9.0));
        return (degree - 32) * (5.0 / 9.0);
    }

    public static double distance(double x, double y, double x1, double y1) {
        return Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
    }

    public static List quadratic(double a, double b, double c) {
        List values = new ArrayList();
        values.add((-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        values.add((-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        return values;
    }

    public static int dayOfWeek(int m, int d, int y) {
        int year = y - (14 - m) / 12;
        int x = year + year / 4 - year / 100 + year / 400;
        int month = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + x + 31 * month / 12) % 7;
        return day;
    }

    public static void calendar(int m, int y){

        System.out.println("S M T W T F S");
        int firstDay = dayOfWeek(m, 1, y);
        for(int skip = firstDay; skip >= 1; skip --){
            System.out.print("  ");
        }
        int row1 = 0;
        for(row1 = 1; row1 <= 7 - firstDay; row1++){
            System.out.print(row1 + " ");
        }
        System.out.println();
        for(int rowNumber = 1; rowNumber <= 5; rowNumber++){
            for(int increase = 1; increase <= 7; increase++){
                System.out.print(row1 + " ");
                row1 += 1;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //System.out.println(convertFToC(212));

        //System.out.println(distance(1,2,3,4));

        //System.out.println(quadratic(1,2,-4));

        //System.out.println(dayOfWeek(12,25,2001));

        calendar(11, 2018);
    }
}
