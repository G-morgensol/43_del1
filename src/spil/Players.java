package spil;

public class Players {
    private static int TotalScore2;
    private static int TotalScore1;
    public static int Player1Turn() {
        int Dice1 = RollDice.RollDicePlayer2()[0];
        int Dice2 = RollDice.RollDicePlayer2()[1];
        int DiceTotal = Dice1 + Dice2;
        TotalScore1 = TotalScore1 + DiceTotal;
        System.out.println("Player 1 rolled: " + Dice1 + " and "+ Dice2);
        System.out.println("New total score is: " + TotalScore1);
        if (Dice1 == Dice2) {
            while (Dice1==Dice2) {
                if (DiceTotal == 2) {
                    TotalScore1 = 0;
                }
                Dice1 = RollDice.RollDicePlayer1()[0];
                Dice2 = RollDice.RollDicePlayer1()[1];
                System.out.println("Player 1 got an extra turn and rolled: " + Dice1 + " and "+ Dice2);
                DiceTotal = Dice1+Dice2;
                TotalScore1 = TotalScore1 + DiceTotal;
                System.out.println("New total Score: " + TotalScore1);
                if (Dice1==Dice2) {
                    System.out.println("Player 1 got a pair! Rolling again.");
                }
            }
        }
        return TotalScore1;
    }



public static int Player2Turn() {
    int Dice1 = RollDice.RollDicePlayer2()[0];
    int Dice2 = RollDice.RollDicePlayer2()[1];
    int DiceTotal = Dice1 + Dice2;
    TotalScore2 = TotalScore2 + DiceTotal;
    System.out.println("Player 2 rolled: " + Dice1 + " and "+ Dice2);
    System.out.println("New total score is: " + TotalScore2);
    if (Dice1 == Dice2) {
    while (Dice1==Dice2) {
        if (DiceTotal == 2) {
            TotalScore1 = 0;
        }
        Dice1 = RollDice.RollDicePlayer2()[0];
        Dice2 = RollDice.RollDicePlayer2()[1];
        System.out.println("Player 2 got an extra turn and rolled: " + Dice1 + " and "+ Dice2);
        DiceTotal = Dice1+Dice2;
        TotalScore2 = TotalScore2 + DiceTotal;
        System.out.println("New total Score: " + TotalScore2);
        if (Dice1==Dice2) {
            System.out.println("Player 2 got a pair! Rolling again.");
        }
    }
    }
    return TotalScore2;
}

    public static void main(String[] args) {
        //Player1Turn();
        //Player2Turn();





    }
}
