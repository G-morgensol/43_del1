package spil;
public class spil {
    public static void main(String[] args) {

        int Player1Score = 0;
        int Player2Score = 0;

        //Sets up a loop that will run until either Player1 or player2 reaches 40 or higher points. Note that it also ends if both reaches more than 40 points.

        while (Player1Score<40 || Player2Score <40) {

            //Defines the Total Score to be the TotalScore from last repeat, plus the new Sum from dice. Note PlayerScore starts at 0.
            Player1Score = Player1Score + EyeSum.SumPlayer1();
            Player2Score = Player2Score + EyeSum.SumPlayer2();


            //Check to see if Player 1 rolled two 1's.
            if (EyeSum.SumPlayer1() == 2) {
                Player1Score = 0;
                //System.out.println("Spiller 1 fik to 1'ere");
            }

            // Checks to see if Player 2 rolled two 1's.
            if (EyeSum.SumPlayer2() == 2) {
                Player2Score = 0;
                //System.out.println("Spiller 2 fik to 1'ere");
            }

            // First check if player 1 rolls two identical rolls, if so they get another turn.
            if(EyeSum.IdenticalPlayer1()){
                RollDice.RollDicePlayer1();
            }

            // First check if player 2 rolls two identical rolls, if so they get another turn.
            if(EyeSum.IdenticalPlayer2()){
                RollDice.RollDicePlayer2();
            }

            //Testing every cycle
            //System.out.println(Player1Score);
            //System.out.println(Player2Score);

        }

        //Prints out a statement to the console based on who won.
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
