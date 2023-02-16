package T07_Q1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T07_Q1b {
    public static void main(String[] args) {
        int max = 0;
        try{
            Scanner sc = new Scanner(new FileInputStream("integer.txt"));
            while (sc.hasNextLine()) {
                int num = sc.nextInt();
                if(num > max)
                    max = num;
                System.out.println(num);
                sc.nextLine(); //***
            }
            System.out.println("Largest integer = " + max);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
