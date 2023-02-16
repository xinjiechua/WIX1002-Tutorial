import java.util.Random;
public class T06_Q1h {

    public static void main(String[] args) {
        int [] num = new int [12];
        System.out.println("The repeated number is " + repeat(num));
    }
    public static int repeat (int [] a){
        Random r = new Random();
        int repeated=-1;
        for (int i=0; i<a.length; i++){
            a[i]=r.nextInt(11);
            System.out.println(a[i]);
            for (int j=0; j<i; j++){
                if (a[i] == a[j]){
                    repeated = a[i];
                    break;
                }
            }
            if (repeated != -1)
                break;
        }
        return repeated;
    }
}
