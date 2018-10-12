public class Main {

    public static void challenge1(){
        for(int line = 1; line <=7; line++){
            for(int star = 7-line; star>=1; star--){
                System.out.print("*");
            }
            for(int space = line; space >=1; space--){
                System.out.print(" ");
            }
            for(int fSlash = 14 - 2 * line; fSlash >=1; fSlash--){
                System.out.print("/");
            }
            for(int bSlash = (line - 1) * 2; bSlash >=1; bSlash--){
                System.out.print("\\");
            }
            for(int space = line; space >=1; space--){
                System.out.print(" ");
            }
            for(int star = 7-line; star>=1; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upArrow(){
        for(int line = 1; line <= 3; line++){
            System.out.print("|");
            for(int outSpace = 3 - line; outSpace >= 1; outSpace--){
                System.out.print(" ");
            }
            System.out.print("^");
            for(int midSpace = (line - 1) * 2; midSpace >=1; midSpace--){
                System.out.print(" ");
            }
            System.out.print("^");
            for(int outSpace = 3 - line; outSpace >= 1; outSpace--){
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }

    public static void downArrow(){
        for(int line = 1; line <= 3; line++){
            System.out.print("|");
            for(int outSpace = line -1; outSpace >= 1; outSpace--){
                System.out.print(" ");
            }
            System.out.print("V");
            for(int midSpace = 6 - line * 2; midSpace >=1; midSpace--) {
                System.out.print(" ");
            }
            System.out.print("V");
            for(int outSpace = line - 1; outSpace >= 1; outSpace--){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void challenge2(){
        System.out.println("+------+");
        upArrow();
        upArrow();
        System.out.println("+------+");
        downArrow();
        downArrow();
        System.out.println("+------+");
    }
    //ignore this comment, it serves no purpose
    public static void upTri(){
        for(int line = 1; line <= 4; line ++){
            System.out.print("|");
            for(int space = 5-line; space >= 1; space-- ){
                System.out.print(" ");
            }
            for(int fSlash = line - 1; fSlash >= 1; fSlash--){
                System.out.print("/");
            }
            System.out.print("*");
            for(int bSlash = line - 1; bSlash >= 1; bSlash--){
                System.out.print("\\");
            }
            for(int space = 5-line; space >= 1; space-- ){
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }

    public static void downTri(){
        for(int line = 1; line <= 4; line ++){
            System.out.print("|");
            for(int space = line; space >= 1; space-- ){
                System.out.print(" ");
            }
            for(int fSlash = 4 - line; fSlash >= 1; fSlash--){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int bSlash = 4 - line; bSlash >= 1; bSlash--){
                System.out.print("/");
            }
            for(int space = line; space >= 1; space-- ){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void challenge3(){
        System.out.println("+---------+");
        upTri();
        downTri();
        System.out.println("+---------+");
        downTri();
        upTri();
        System.out.println("+---------+");
    }

    public static void main(String[] args){
        challenge1();
        System.out.println();
        challenge2();
        System.out.println();
        challenge3();
    }
}
