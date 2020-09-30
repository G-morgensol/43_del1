package spil;
import gui_main.GUI;
public class spil {
    public static void main(String[] args) {


        int i = 0;
        while (true) {
            //Starts Player 1 Turn

            System.out.println("Player 1 turn");
            Players.Player1Turn();
            //Starts Player 2 Turn
            System.out.println("Player 2 turn");
            Players.Player2Turn();


            //In the extremely unlikely case the game is not over after 100 iterations, break;
            i++;
            //Iteration print is just for testing purposes, remove at final version.
            System.out.println("Iteration: " + i);
            if (i == 100) {
                break;
            }
        }
    }
}



