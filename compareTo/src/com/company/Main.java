package com.company;
import java.util.Arrays;

public class Main {

    public static void mystery(int[] data, int x, int y){
        data[data[x]] = data[y];
        data[y] = x;
    }


    public static void main(String[] args) {
        int[] numbers = {3,7,1,0,25,4,18,-1,5};
        mystery(numbers, 3,1);
        mystery(numbers, 5,6);
        mystery(numbers, 8,4);
    System.out.println(Arrays.toString(numbers));
        }
}
