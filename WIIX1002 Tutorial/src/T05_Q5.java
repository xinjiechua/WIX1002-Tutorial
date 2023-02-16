import java.util.Scanner;
public class T05_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String [] word = sentence.split(" ");
        for(int i = word.length - 1; i>=0; i--) {
            for (int j = word[i].length() -1;j >= 0;j--){
                System.out.print(word[i].charAt(j));
            }
        }
    }
}
