package com.company;


public class Main {

    public static void botPiece(){
        System.out.println("\\        /");
        System.out.println(" \\______/");

    }

    public static void topPiece(){
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");

    }

    public static void egg() {
        topPiece();
        botPiece();

    }

    public static void teacup() {
        botPiece();
        System.out.println("+--------+");

    }

    public static void stopSign() {
        topPiece();
        System.out.println("|  STOP   |");
        botPiece();

    }

    public static void hatFigure() {

        topPiece();
        System.out.println("+--------+");


    }

    public static void space(int x){

        for(int i=0; i<x; i++ ){
            System.out.println();

        }
    }

    public static void main(String[] args) {
    egg();
    space(1);

    teacup();
    space(2);

    stopSign();
    space(1);

    hatFigure();


    }
}
