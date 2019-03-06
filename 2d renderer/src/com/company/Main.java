package com.company;

import java.util.concurrent.TimeUnit;

public class Main {
    public static String[][] screen = new String[20][20];

    public static void main(String[] args) throws Exception{

        run(10000,10);

    }

    public static void run(int time, int changes) throws Exception{

        for(int runs = 0; runs < changes; runs++) {
            clearScreen();
            //Where the functions for drawing go
            drawTriangle(
                    (int) (Math.random() * (screen.length - 1)),
                    (int) (Math.random() * (screen.length - 1)),
                    (int) (Math.random() * (screen.length - 1)),
                    (int) (Math.random() * (screen.length - 1)),
                    (int) (Math.random() * (screen.length - 1)),
                    (int) (Math.random() * (screen.length - 1))
            );


            //End of drawings
            render();
            TimeUnit.MILLISECONDS.sleep(time / changes);
        }

    }

    public static void clearScreen(){
        for(int y = 0; y < screen.length; y++ ){
            for(int x = 0; x<screen[0].length; x++) {
                screen[x][y] = "  ";
            }
        }
    }

    public static void drawTriangle(int x0, int y0, int x1, int y1, int x2, int y2){
        drawLine(x0,y0,x1,y1);
        drawLine(x1,y1,x2,y2);
        drawLine(x2,y2,x0,y0);
        drawPoint(x0,y0);
        drawPoint(x1,y1);
        drawPoint(x2,y2);
    }

    public static void drawLine(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        if(m<=1 && m>=-1){
            double startX = Math.min(x1, x2);
            double startY;
            if (x2 > x1) {
                startY = y1;
            } else {
                startY = y2;
            }
            startY = startY - m * startX;//y = mx+b,so b = y-mx
            double endX = Math.max(x1, x2);

            //System.out.println("startX " + startX);
            //System.out.println("startY " + startY);
            for (int i = (int) (startX); i <= endX; i++) {
                if (i < screen.length && (int) (i * m) < screen[0].length)
                    //System.out.println(i);
                    //System.out.println(i*m+startY);
                    if (m <= 1) {
                        addToRender(i, (int) (Math.round(i * m + startY)), m);
                    }

            }
        }else{  //needs to find the inverse of the line
            //the switcheroo
            m = 1/m;
            double cache = x1;
            x1=y1;
            y1=cache;

            cache = x2;
            x2=y2;
            y2 = cache;


            double startX = Math.min(x1, x2);
            double startY;
            if (x2 > x1) {
                startY = y1;
            } else {
                startY = y2;
            }
            startY = startY - m * startX;//y = mx+b,so b = y-mx
            double endX = Math.max(x1, x2);

            //System.out.println("startX " + startX);
            //System.out.println("startY " + startY);
            for (int i = (int) (startX); i <= endX; i++) {
                if (i < screen.length && (int) (i * m) < screen[0].length)
                    //System.out.println(i);
                    //System.out.println(i*m+startY);
                    if (m <= 1) {
                        addToRender((int) (Math.round(i * m + startY)), i , 1/m);
                    }

            }
        }
    }

    public static void addToRender(int x, int y, double m){
        if(m>0.5) screen[x][y] = "* "; // /
        else if (m<-0.5) screen[x][y] = "* "; // \\
        else screen[x][y] = "* "; // -
    }

    public static void drawPoint(int x, int y){screen[x][y] = "* ";}

    public static void render(){
        for(int y = screen[0].length-1; y >= 0; y-- ){
            System.out.print(y + " ");
            for(int x = 0; x<screen.length; x++){
                System.out.print(screen[x][y]);
            }
            System.out.println();

        }
        System.out.print("  " + 0+ " ");
        for(int xAxis = 1; xAxis<screen.length; xAxis++){
            System.out.print(xAxis + " ");
        }
    }
}
