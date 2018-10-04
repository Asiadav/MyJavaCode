public class reverse {

    public static void main(String[] args){

        int start = 123456789;
        double stacker = 0;
        int length = 0;

        int altStart = start;

        for(int i = 1; altStart != 0; i ++){
            altStart = altStart / 10;
            length = i;
        }

        for(int i = 1; start != 0; i ++){
            stacker = stacker + (start % 10) * Math.pow(10, length + 1 - i);
            start = start / 10;
        }
        stacker = stacker / 10;
        System.out.println(stacker);
    }
}
