import java.util.Scanner;

public class T02_Q7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inches = sc.nextDouble();

        double meters = inches*0.0254;
        System.out.printf(inches + " inches = " +  "%.2f meters",meters);

    }
}
