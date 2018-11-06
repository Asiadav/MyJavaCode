package triangles;

import java.util.Arrays;

public class Triangles {

    public static double[] LawOfCos(double a, double b, double c){  //takes 3 triangle sides and returns the angles opposite those sides in an array
        double angles[] = new double[3];
        angles[0] = Math.toDegrees(Math.acos((a * a - b * b - c * c)/( -2 * b * c)));
        angles[1] = Math.toDegrees(Math.acos((b * b - a * a - c * c)/( -2 * a * c)));
        angles[2] = Math.toDegrees(Math.acos((c * c - b * b - a * a)/( -2 * b * a)));
        return angles;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(LawOfCos(3,4,5)));

    }
}

