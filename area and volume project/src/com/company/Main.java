package com.company;

public class Main {

    public static double AoC(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
//ignore this comment

    public static double VoC(double radius, double height){
        return AoC(radius) * height;
    }

    public static void main(String[] args) {
	System.out.println(VoC(1, 1));
    }
}
