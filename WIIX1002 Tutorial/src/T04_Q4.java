import java.util.Scanner;
public class T04_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        for(int i = sentence.length()-1; i >=0; i--){
            System.out.print(sentence.charAt(i));
        }

    }


}
