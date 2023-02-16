//Display a list of 5 random numbers in descending order.
import java.util.Random;
public class T01_Q11{
    public static void main(String[]args){
        Random r = new Random();
        int [] num = new int[5];

        for (int i = 0; i < 5; i++) {
            num[i] = r.nextInt(10);
        }

        bubbleSort(num);

        System.out.println("The descending order of 5 numbers: ");
        for(int i:num){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int [] array){
        for(int i=0; i<array.length -1; i++){
            for(int j=0; j < array.length-1; j++){  // Last i elements are already in place
                if(array[j] < array[j+1]){  // ascending order (>) | descending order(<)
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}