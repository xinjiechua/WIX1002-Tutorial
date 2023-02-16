import java.util.Arrays;
public class T06_Q1f {
    public static void main(String[]args){
        int [] num = new int[10];
        randNum(num);
        System.out.println(Arrays.toString(num));
    }
    static void randNum (int[]num){
        for(int i=0; i<num.length; i++)
            num[i] = (int)(Math.random() *101);
    }

}
