package spil;
import java.util.Scanner;
public class spil {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            Scanner nextroll = new Scanner(System.in);

            System.out.println("Player 1 turn, press enter to roll");
            nextroll.nextLine();
            Players.Player1Turn();
            System.out.println("Player 2 turn press enter to roll");
            nextroll.nextLine();
            Players.Player2Turn();


            //In the unlikely case the game is not over after 100 iterations, break;
            i++;
            if (i ==100) {
                break;
            }

        }
    }
}
