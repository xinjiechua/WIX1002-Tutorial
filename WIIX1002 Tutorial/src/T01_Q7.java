import java.util.Random;

public class T01_Q7 {
    public static void main(String[]args){
        Random  r = new Random();
        int odd = 0, even = 0;
        for(int i=0; i<10; i++){
            int num = r.nextInt(90) + 10;
            if(num % 2 == 0)
                even ++;
            else
                odd++;
        }
        System.out.println("Number of odd number = " + odd);
        System.out.println("Number of even number = " + even);
    }
}
