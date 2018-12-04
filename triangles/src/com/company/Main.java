package com.company;

import java.util.Arrays;

public class Main {

    public static double[] LawOfCos(double a, double b, double c){  //takes 3 triangle sides and returns the angles opposite those sides in an array
        double angles[] = new double[3];
        angles[0] = Math.round(Math.toDegrees(Math.acos((a * a - b * b - c * c)/( -2 * b * c)))*1000)/1000.0;
        angles[1] = Math.round(Math.toDegrees(Math.acos((b * b - a * a - c * c)/( -2 * a * c)))*1000)/1000.0;
        angles[2] = Math.round(Math.toDegrees(Math.acos((c * c - b * b - a * a)/( -2 * b * a)))*1000)/1000.0;
        return angles;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(LawOfCos(3,4,5)));
    }
}