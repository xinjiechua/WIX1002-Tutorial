import java.util.Random;
public class T01_Q4 {
    public static void main(String[]args){
        Random r = new Random();
        int player1 = r.nextInt(6)+1;
        int player2 = r.nextInt(6)+1;

        System.out.println("Dice number of Player 1: " + player1);
        System.out.println("Dice number of Player 2: " + player2);
        if(player1 == player2)
            System.out.println("It's a tie.");
        else if(player1 > player2)
            System.out.println("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }
}
