//Display the frequency of a keyword from a web page.

import java.util.Scanner;

public class T01_Q9 {
    public static void main(String[]args) {
        int frequency = 0;
        char keyword;
        String url;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input keyword");
        keyword = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Input url");
        url = sc.nextLine();

        char[]webPageText = url.toCharArray();

        for(char word : webPageText){
            if(word == keyword)
                frequency ++;
            System.out.print(word + " ");
        }

        System.out.println("\nThe word " + keyword + " has a frequency of " + frequency );
    }
}
