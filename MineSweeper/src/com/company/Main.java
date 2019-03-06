package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What width do you want? (Integer)");
        int width = input.nextInt();
        System.out.println("\nWhat height do you want? (Integer)");
        int height = input.nextInt();
        System.out.println("\nWhat probability do you want? (Double 0.0 is no chance, 1.0 is 100% chance)");
        double prob = input.nextDouble();

        run(width,height, prob);

    }


    public static void run(int width, int height, double prob){
        String[][] map = new String[height+2][width+2];

        for(int r = 1; r < map.length-1; r++) {
            for (int c = 1; c < map[0].length-1; c++) {
                if (Math.random() < prob) {
                    map[r][c] = "*";
                }else{
                    map[r][c] = " ";
                }
            }
        }

        int mineCounter;
        for(int r = 1; r < map.length-1; r++){
            for(int c = 1; c < map[0].length-1; c++){
                if(!map[r][c].equals("*")) {
                    mineCounter = 0;
                    if (map[r + 0][c - 1] == "*") mineCounter++;
                    //if (map[r + 0][c + 0] == "*") mineCounter++;
                    if (map[r + 0][c + 1] == "*") mineCounter++;
                    if (map[r + 1][c - 1] == "*") mineCounter++;
                    if (map[r + 1][c + 0] == "*") mineCounter++;
                    if (map[r + 1][c + 1] == "*") mineCounter++;
                    if (map[r - 1][c + 0] == "*") mineCounter++;
                    if (map[r - 1][c + 1] == "*") mineCounter++;
                    if (map[r - 1][c - 1] == "*") mineCounter++;

                    map[r][c] = "" + mineCounter;

                }
            }
        }
        for(int r = 1; r < map.length-1; r++) {
            for (int c = 1; c < map[0].length-1; c++) {
                System.out.print(map[r][c] + " ");
            }
            System.out.println();
        }
    }

}
