public class fibonacci {

    public static void main(String[] args){
        double x;       //Fn-2
        double y = 1;   //Fn-1
        double z = 0;   //initial value of sequence
        double n = 40;  //number of iterates

        for(int i = 1; i <= n; i++){
            System.out.println(i + ": " + (int)(z));
            x = y;
            y = z;
            z = x + y;

        }
    }
}
