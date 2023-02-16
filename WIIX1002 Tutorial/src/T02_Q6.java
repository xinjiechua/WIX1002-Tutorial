import java.util.Scanner;

public class T02_Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double diameter = sc.nextDouble();

        double circumference = Math.PI*diameter;
        System.out.printf("The circumference of the circle is: %.3f" ,circumference);

    }
}
