public class fibonacci {

    public static void main(String[] args){
        int x = 1;
        int y = 1;
        int z = 0;
        int n = 10;

        for(int i = 1; i <= n; i++){
            x = y;
            y = z;
            z = x + y;
            System.out.println(z);

        }
    }
}
