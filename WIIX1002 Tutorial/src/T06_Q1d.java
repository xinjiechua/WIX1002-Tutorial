public class T06_Q1d {
    public static void main(String[]args){
        System.out.println(isPentagonalNum(5));

    }
    static boolean isPentagonalNum(int num){
        for(int i=0; i<=num; i++){
            double P = 0.5*i*(3*i-1);
            if(P == num)
                return true;
        } return false;
    }

}
