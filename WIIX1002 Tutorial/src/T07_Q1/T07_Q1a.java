package T07_Q1;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class T07_Q1a {
    public static void main(String[] args) {
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("integer.txt"));
            for(int i=0;i<10;i++)
                outputStream.println((int)(Math.random()*1001));
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
