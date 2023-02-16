package T07_Q1;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T07_Q1c {
    public static void main(String[] args) {
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            for(int i=0;i<10;i++)
                outputStream.writeInt((int)(Math.random()*1001));
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
