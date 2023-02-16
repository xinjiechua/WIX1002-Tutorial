import java.util.Random;

public class T01_Q6 {
    public static void main(String[]args){
        Random r = new Random();
        int min = r.nextInt(100);
        for(int i=0; i<9;i++){
            int num = r.nextInt(100);
            if(num < min)
                min = num;
        }
        System.out.println("Minimum number: " + min);

    }
}
