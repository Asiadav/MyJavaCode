/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceneedle;

/**
 *
 * @author davis
 */

public class SpaceNeedle {

    public static final int SIZE = 4;

    public static void needle(){
        for(int i = SIZE; i >= 1; i--){
            for(int space = SIZE * 3; space >= 1; space--){
                System.out.print(" ");
            }
            System.out.println("||");
        }

    }

    public static void top() {
        for (int i = 1; i <= SIZE; i++) {
            for (int space = SIZE - i ; space >= 1; space--) {
                System.out.print("   ");
            }
            System.out.print("__/");
            for (int colon = (i - 1) * 3; colon >= 1; colon--) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int colon = (i - 1) * 3; colon >= 1; colon--) {
                System.out.print(":");
            }
            System.out.println("\\__");

        }

        System.out.print("|");
        for(int quote = SIZE * 6; quote >=1; quote--){
            System.out.print("\"");
        }

        System.out.println("|");
    }

    public static void bot(){
        for (int line = SIZE; line >=1; line--){
            for(int space = SIZE - line; space >=1; space--){
                System.out.print("  ");
            }
            System.out.print("\\_");
            for(int m = 2*line + SIZE - 1; m >=1; m = m-1){
                System.out.print("/\\");
            }

            System.out.println("_/");
        }
    }

    public static void mid(){
        for(int line = 1; line <= SIZE * 3; line++){
            for(int space = SIZE *2 + 1; space >=1; space--){
                System.out.print(" ");
            }
            System.out.print("|");
            for (int percent = SIZE - 2; percent >=1; percent--){
                System.out.print("%");
            }
            System.out.print("||");
            for (int percent = SIZE - 2; percent >=1; percent--){
                System.out.print("%");
            }
            System.out.println("|");

        }
    }


    public static void main(String[] args) {

       needle();
       top();
       bot();
       needle();
       mid();
       top();

        }
    }


