public class exponential {

    public static void main(String[] args){

        double result = 1;
        double base = 10;
        double power = -1;
        if(power < 0){
            System.out.println("no");
        }
        else{
            for(int i = 1; i <= power; i++){
                result = result * base;

            }
            if(result == 0){
                result = 1;
            }
        }


    System.out.println(result);

    }
}
