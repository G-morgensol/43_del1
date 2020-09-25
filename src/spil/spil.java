package spil;
import java.lang.reflect.Method;
public class spil {
    public static void main(String[] args) {


        int max = 6;
        int min = 1;
        int range = max - min + 1;
        /*

        //Test af Math.random() funktionen

        int Dice1 = (int)(Math.random()*range) + min;
        System.out.println( "Du slog " + Dice1 + " med din første terning!");
        int Dice2 = (int)(Math.random()*range) + min;
        System.out.println( "Du slog " + Dice2 + " med din anden terning!");
        int TotalEyes = Dice1 + Dice2;
        System.out.println("Summen af dit kast er: " + TotalEyes );
        */

        int Player1Score = 0;
        int Player2Score = 0;
        while (Player1Score<40 || Player2Score <40) {
            int[] Player1Dice = RollDice.RollDicePlayer1();
            int[] Player2Dice = RollDice.RollDicePlayer2();

            int Dice1Player1 = (int)(Math.random()*range) + min;
            int Dice2Player1 = (int)(Math.random()*range) + min;
            int TotalEyesPlayer1 = Dice1Player1 + Dice2Player1;
            Player1Score = Player1Score + TotalEyesPlayer1;
            int Dice1Player2 = (int)(Math.random()*range) + min;
            int Dice2Player2 = (int)(Math.random()*range) + min;
            int TotalEyesPlayer2 = Dice1Player2 + Dice2Player2;
            Player2Score = Player2Score + TotalEyesPlayer2;


            /* test af pointsystem

            System.out.println("Spiller 1 har " + Player1Score + " point");
            System.out.println("Spiller 2 har " + Player2Score + " point");
            */



            System.out.println("Player 1 Rolls");
            System.out.println("Dice 1: " + Player1Dice[0]);
            System.out.println("Dice 2: " + Player1Dice[1]);
            System.out.println("Player 1 Rolls");
            System.out.println("Dice 1: " + Player2Dice[0]);
            System.out.println("Dice 2: " + Player2Dice[1]);

        }
        int TotalEyes = RollDice.RollDicePlayer1()[0] + RollDice.RollDicePlayer1()[1];
        System.out.println(TotalEyes);
        if (Player1Score>Player2Score) {
            System.out.println("Spiller 1 vandt!");
        }
        else if (Player1Score<Player2Score) {
            System.out.println("Spiller 2 vandt!");
        }
        else {
            System.out.println("Uafgjort!");
        }
    }
}
