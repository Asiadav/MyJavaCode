public class CodeSprint {

    public static void main(String[] args){

        int sum = 0;
        for(int i = 1; i <= 100; i=i+2){
            sum = sum + i;
            //System.out.println(i+ " "+" "+ sum);
        }
        System.out.println("sum of all even numbers up to 100: " + sum);
        System.out.println();

        sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = sum + i * i;
        }
        System.out.println("sum of all squares up to 100: " + sum);
        System.out.println();

        for(int i = 0; i <= 30; i++){
            System.out.println("2 to the power of " + i + " = " + (int)(Math.pow(2,i)));
        }
    }
}
