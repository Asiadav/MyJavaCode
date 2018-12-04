package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static double distance (double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double area(double x1, double y1, double x2, double y2, double x3, double y3){
        double x1Tox2 = distance(x1, y1, x2, y2);
        double x2Tox3 = distance(x2, y2, x3, y3);
        return (x1Tox2 * x2Tox3 * (Math.sin(Math.PI*(intAngle(x1, y1, x2, y2, x3, y3)[2])/180)))/2;
    }

    public static double perimeter (double x1, double y1, double x2, double y2, double x3, double y3) {
        double sideA = distance(x1, y1, x2, y2);
        double sideB = distance(x2, y2, x3, y3);
        double sideC = distance(x1, y1, x3, y3);

        return sideA + sideB + sideC;
    }

    public static void graph(double x1, double y1, double x2, double y2, double x3, double y3){
        int width = (int)(Math.ceil(Math.max(Math.max(x1, x2), x3))) + 2;
        int height = (int)(Math.ceil(Math.max(Math.max(y1, y2), y3))) + 2;
        boolean[][] graph = new boolean[width][height];
        graph[(int)(x1)][(int)(y1)] = true;
        graph[(int)(x2)][(int)(y2)] = true;
        graph[(int)(x3)][(int)(y3)] = true;
        System.out.println("Graph:");
        for(int y = height-1; y >= 0; y--){
            System.out.print(y);

            for(int x = 0; x <= width-1; x ++){
                if (graph[x][y]){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        for(int x = 0; x <= width; x ++){
            System.out.print(" "+x);
        }
        System.out.println("\n");

    }

    public static double[] intAngle(double x1, double y1, double x2, double y2, double x3, double y3){
        double a = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        double b = Math.sqrt(Math.pow((x2-x3),2) + Math.pow((y2-y3),2));
        double c = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));

        double angles[] = new double[3];
        angles[0] = Math.round(Math.toDegrees(Math.acos((a * a - b * b - c * c)/( -2 * b * c))));
        angles[1] = Math.round(Math.toDegrees(Math.acos((b * b - a * a - c * c)/( -2 * a * c))));
        angles[2] = Math.round(Math.toDegrees(Math.acos((c * c - b * b - a * a)/( -2 * b * a))));
        return angles;

    }

    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;
        Scanner input = new Scanner(System.in);
        boolean collectInfo = true;
        while(collectInfo) {
            collectInfo = false;

            try {
                System.out.print("First coordinate (x y)");
                x1 = input.nextDouble();
                y1 = input.nextDouble();

                System.out.print("Second coordinate (x y)");
                x2 = input.nextDouble();
                y2 = input.nextDouble();

                System.out.print("Third coordinate (x y)");
                x3 = input.nextDouble();
                y3 = input.nextDouble();

            }catch (InputMismatchException heck){
                System.out.println("\nPlease input in the format: x y");
                input = new Scanner(System.in);

            }
             /*
            System.out.print("First coordinate (x y)");
            String coord1 = input.nextLine();

            System.out.print("Second coordinate (x y)");
            String coord2 = input.nextLine();

            System.out.print("Third coordinate (x y)");
            String coord3 = input.nextLine();

            //taking a nextLine()
            x1 = Double.parseDouble(coord1.substring(coord1.indexOf("(")+1, coord1.indexOf(",")));
            y1 = Double.parseDouble(coord1.substring(coord1.indexOf(" ")+1, coord1.indexOf(")")));
            x2 = Double.parseDouble(coord2.substring(coord2.indexOf("(")+1, coord2.indexOf(",")));
            y2 = Double.parseDouble(coord2.substring(coord2.indexOf(" ")+1, coord2.indexOf(")")));
            x3 = Double.parseDouble(coord3.substring(coord3.indexOf("(")+1, coord3.indexOf(",")));
            y3 = Double.parseDouble(coord3.substring(coord3.indexOf(" ")+1, coord3.indexOf(")")));
*/

            try {
                if (intAngle(x1, y1, x2, y2, x3, y3)[0] + intAngle(x1, y1, x2, y2, x3, y3)[1] + intAngle(x1, y1, x2, y2, x3, y3)[2] != 180.0) {
                    //triangle isn't legit
                    System.out.println("That isn't a triangle\n");
                    //System.out.println("Angles: "+Arrays.toString(intAngle(x1, y1, x2, y2, x3, y3)));

                    collectInfo = true;

                }
            }catch (Exception notRealTriangle){
                System.out.println("That Doesn't work!");

            }
        }

        graph(x1, y1, x2, y2, x3, y3);


        boolean quit = false;

        while(!quit){
            System.out.println("1: perimeter");
            System.out.println("2: interior angle");
            System.out.println("3: area");
            System.out.println("4: quit");
            int selection = input.nextInt();
            if(selection == 1){
                //run perimeter function
                System.out.println(perimeter(x1, y1, x2, y2, x3, y3));
            }
            if(selection == 2){
                //run interior angle function
                System.out.println(Arrays.toString(intAngle(x1, y1, x2, y2, x3, y3)));

            }
            if(selection == 3){
                //run area function
                System.out.println("The area is: "+area(x1, y1, x2, y2, x3, y3));
            }
            if(selection == 4){
                quit = true;
                break;
            }


        }

    }
}
