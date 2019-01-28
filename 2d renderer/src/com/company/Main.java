package com.company;

import java.util.concurrent.TimeUnit;

public class Main {
    public static String[][] screen = new String[10][10];

    public static void main(String[] args) {

        for(int y = 0; y < screen.length; y++ ){
            for(int x = 0; x<screen[0].length; x++) {
                screen[x][y] = "  ";
            }
        }

       //drawTriangle(3,4,5);
        drawLine(1,1,9,9);

        render();

    }

    public static void drawTriangle(int x, int y, int size){
        for(int i = size; i > 0; i --){
            for(int j = 0; j < i; j++){
                addToRender(x+j+size-i,y-size+i);
            }
        }
    }

    public static void drawLine(double x1, double y1, double x2, double y2){
        double m =(y2-y1)/(x2-x1);
        double startX = Math.min(x1,x2);
        double startY;
        if(x2>x1) {
            startY = y1;
        }
        else{
            startY = y2;
        }
        startY = startY - m*startX;//y = mx+b,so b = y-mx
        double endX = Math.max(x1,x2);

        System.out.println("startX " + startX);
        System.out.println("startY" + startY);

        //addToRender((int)(startX),(int)(startY));

        for(int i = (int)(startX); i < endX; i++){
            if(i < screen.length && (int)(i*m) < screen[0].length)
                System.out.println(i);
                System.out.println(i*m+startY);
            addToRender(i, (int)(i*m+startY));
        }

    }

    public static void addToRender(int x, int y){
        screen[x][y] = "* ";
    }

    public static void render(){
        for(int y = screen.length-1; y >= 0; y-- ){
            for(int x = 0; x<screen[0].length; x++){
                System.out.print(screen[x][y]);
            }
            System.out.println();
            System.out.print(y + " ");
        }
    }
}
