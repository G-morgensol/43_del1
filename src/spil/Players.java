package spil;

public class Players {
    public static boolean Player1End;
    public static boolean Player2End;
    private static int TotalScore2;
    private static int TotalScore1;
    public static int Player1Turn() {
        //Calls 2 methods and gets 2 numbers between 1 and 6. Stores them into 2 local variables.
        int Dice1 = RollDice.RollDicePlayer2()[0];
        int Dice2 = RollDice.RollDicePlayer2()[1];

        //Gets the sum of the two die.
        int DiceTotal = Dice1 + Dice2;

        TotalScore1 = TotalScore1 + DiceTotal;
        System.out.println("Player 1 rolled: " + Dice1 + " and " + Dice2);
        System.out.println("New total score is: " + TotalScore1);
        //Player will get an extra turn if the player gets a pair. sets up a while loop that breaks if untrue.
        if (Dice1 == Dice2) {
            while (Dice1 == Dice2) {
                if (DiceTotal == 2) {
                    TotalScore1 = 0;
                }
                Dice1 = RollDice.RollDicePlayer1()[0];
                Dice2 = RollDice.RollDicePlayer1()[1];
                System.out.println("Player 1 got an extra turn and rolled: " + Dice1 + " and " + Dice2);
                DiceTotal = Dice1 + Dice2;
                TotalScore1 = TotalScore1 + DiceTotal;
                System.out.println("New total Score: " + TotalScore1);
                if (Dice1 == Dice2 && TotalScore1 >= 40) {
                    System.out.println("Player 1 won with a pair of: " +Dice1 + "'s");
                    Player1End = true;
                    System.exit(0);
                }
                if (Dice1 == Dice2) {
                    System.out.println("Player 1 got a pair! Rolling again.");
                }
            }
        }

        //The Method is set to return the total score of Player 1
        return TotalScore1;
    }



public static int Player2Turn() {
    int Dice1 = RollDice.RollDicePlayer2()[0];
    int Dice2 = RollDice.RollDicePlayer2()[1];
    int DiceTotal = Dice1 + Dice2;
    TotalScore2 = TotalScore2 + DiceTotal;
    System.out.println("Player 2 rolled: " + Dice1 + " and "+ Dice2);
    System.out.println("New total score is: " + TotalScore2);
    if (Dice1 == Dice2 && TotalScore2 >= 40) {
        System.out.println("Player 2 won with a pair of: " + Dice1 + "'s");
        Player2End = true;
        System.exit(0);
        if (Dice1 == Dice2) {
            while (Dice1 == Dice2) {
                if (DiceTotal == 2) {
                    TotalScore1 = 0;
                }
                Dice1 = RollDice.RollDicePlayer2()[0];
                Dice2 = RollDice.RollDicePlayer2()[1];
                System.out.println("Player 2 got an extra turn and rolled: " + Dice1 + " and " + Dice2);
                DiceTotal = Dice1 + Dice2;
                TotalScore2 = TotalScore2 + DiceTotal;
                System.out.println("New total Score: " + TotalScore2);
                if (Dice1 == Dice2) {
                    System.out.println("Player 2 got a pair! Rolling again.");
                }
            }
        }
    }
    return TotalScore2;
}

    //public static void main(String[] args) {
        //Player1Turn();
        //Player2Turn();





    }
