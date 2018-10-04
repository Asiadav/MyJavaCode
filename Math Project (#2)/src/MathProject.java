
public class MathProject {

    public static void triangle(){
        double h = 10;
        double b = 10;
        double triangleArea = h * b / 2;
        System.out.println("triangle with base "+b+" and height "+h+" has area "+triangleArea);
    }

    public static void trap(){
        double h = 10;
        double b1 = 5;
        double b2 = 10;
        double trapArea = (b1 + b2)*h/2;
        System.out.println("trapezoid with height "+h+" and base "+b2+" and top "+b1+" has an area of "+trapArea);
    }

    public static void temp(){
        double tempF = 72;
        double tempC = (tempF - 32) * 5 / 9;
    }

    public static void sphere(){
        double r = 1;
        double sphereArea = 4 * 3.14 * r * r;

    }

    public static void cone(){
        double r = 2;
        double h = 3;
        double coneVolume = 3.14 * r * r * h / 3;
    }

    public static void windChill(){
        double t = 80;
        double v = 100;
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    public static void quadFormula(){
        double a = 3;
        double b = 2;
        double c = 6;
        double x = (-1 * b + Math.pow((b*b - 4*a*c), 0.5))/(2*a);

    }



    public static void main(String[] args){
        triangle();
        trap();
        temp();
        sphere();
        cone();
        windChill();
        quadFormula();


    }
}
