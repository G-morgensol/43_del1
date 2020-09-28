package spil;

public class Players {
/*class Player1Turn {
    int Player1Score = 0;
    int eyesumlocal = EyeSum.SumPlayer1();
    int Dice1 = RollDice.RollDicePlayer1()[0];
    int Dice2 = RollDice.RollDicePlayer1()[1];
    Player1Score = Player1Score + eyesumlocal;
*/



public static int Player2Turn() {

    int eyesumlocal = EyeSum.SumPlayer2();
    int Dice1 = RollDice.RollDicePlayer2()[0];
    int Dice2 = RollDice.RollDicePlayer2()[1];
    TotalScore2 = TotalScore2 + eyesumlocal;
    System.out.println("Spiller 2 slog " + Dice1 + " og "+ Dice2);
    return TotalScore2;


}

    public static void main(String[] args) {
    int TotalScore1 = 0;
    int TotalScore2 = 0;
    Player2Turn();




    }
}
