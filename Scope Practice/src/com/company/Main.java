package com.company;

public class Main {

    public static int SIZE = 1;

    public static void printBorder(){
        System.out.print("#");
        for(int i = SIZE * 4; i >= 1; i--){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void printTopHalf(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            for(int space = 2*SIZE - line * 2; space >= 1; space--){
                System.out.print(" ");
        }
            System.out.print("<>");
            for(int dot = (line - 1) * 4; dot >= 1; dot--){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space = 2*SIZE - line * 2; space >= 1; space--){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void printBotHalf(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            for(int space = (line-1) * 2; space >= 1; space--){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dot = (SIZE-line)*4; dot >= 1; dot--){
                System.out.print(".");
            }
            System.out.print("<>");
            for(int space = (line-1) * 2; space >= 1; space--){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void sleep(int amt) // In milliseconds
    {
        long a = System.currentTimeMillis();
        long b = System.currentTimeMillis();
        while ((b - a) <= amt)
        {
            b = System.currentTimeMillis();
        }
    }
    public static void main(String[] args) {
    for(int i = 1; i <= 40; i++){
        sleep(i*10);
        SIZE = i;
        printBorder();
        printTopHalf();
        printBotHalf();
        printBorder();
    }


    }
}
