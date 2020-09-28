package spil;

public class Players {
    private static int TotalScore2;
/*class Player1Turn {
    int Player1Score = 0;
    int eyesumlocal = EyeSum.SumPlayer1();
    int Dice1 = RollDice.RollDicePlayer1()[0];
    int Dice2 = RollDice.RollDicePlayer1()[1];
    Player1Score = Player1Score + eyesumlocal;
*/



public static int Player2Turn() {
    int Dice1 = RollDice.RollDicePlayer2()[0];
    int Dice2 = RollDice.RollDicePlayer2()[1];
    int eyesumlocal2 = Dice1 + Dice2;
    TotalScore2 = TotalScore2 + eyesumlocal2;
    System.out.println("Player one rolled: " + Dice1 + " and "+ Dice2);
    System.out.println("New total score is: " + TotalScore2);
    if (Dice1 == Dice2) {
    while (Dice1==Dice2) {
        Dice1 = RollDice.RollDicePlayer2()[0];
        Dice2 = RollDice.RollDicePlayer2()[1];
        System.out.println("Player 2 got an extra turn and rolled: " + Dice1 + " and "+ Dice2);
        int DiceTotal = Dice1+Dice2;
        System.out.println("Total point: " + DiceTotal);
        if (Dice1==Dice2) {
            System.out.println("Player one got a pair! Rolling again.");
        }
    }
    }
    return TotalScore2;


}

    public static void main(String[] args) {
    Player2Turn();
    System.out.println(TotalScore2);




    }
}
