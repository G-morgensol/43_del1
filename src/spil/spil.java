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
            //Define first and second roll to make the variable call shorter
            int firstdiceplayer1 = RollDice.RollDicePlayer1()[0];
            int seconddiceplayer1 = RollDice.RollDicePlayer1()[1];
            boolean checksixes = false;

            // If player 1 rolls 2x6 twice in a row, then he wins.
            if(firstdiceplayer1 == 6 && seconddiceplayer1 == 6){
                System.out.println("Hit sixes!");
                if (checksixes) {
                    // Set player 1 score to 100 so that he wins
                    Player1Score = 100;
                    System.out.println("Player 1 won since he rolled two sixes in a row!");
                    break;
                } else {
                    checksixes = true;
                    System.out.println("First time hitting sixes!");
                }
            } else {
                checksixes = false;
            }
            //Define first and second roll to make the variable call shorter
            int firstdiceplayer2 = RollDice.RollDicePlayer2()[0];
            int seconddiceplayer2 = RollDice.RollDicePlayer2()[1];

            // If player 2 rolls 2x6 twice in a row, then he wins.
            if(firstdiceplayer2 == 6 && seconddiceplayer2 == 6){
                System.out.println("Hit sixes!");
                if (checksixes) {
                    // Set player 1 score to 100 so that he wins
                    Player2Score = 100;
                    System.out.println("Player 2 won since he rolled two sixes in a row!");
                    break;
                } else {
                    checksixes = true;
                    System.out.println("First time hitting sixes!");
                }
            } else {
                checksixes = false;
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
