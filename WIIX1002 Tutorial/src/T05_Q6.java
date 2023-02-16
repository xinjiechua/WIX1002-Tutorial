import java.util.Arrays;
public class T05_Q6 {
    public static void main(String[] args) {
        int num = (int)(Math.random() *256);
        System.out.println("The number is :" + num);
        String bin = Integer.toBinaryString(num);
        char [] binaryArray = bin.toCharArray();
        System.out.println("Binary number: " + Arrays.toString(binaryArray));
        System.out.println(bin);
    }
}
