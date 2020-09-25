package spil;

public class EyeSum {
    public static int SumPlayer1() {
        return RollDice.RollDicePlayer1()[0] + RollDice.RollDicePlayer1()[1];
    }
    public static int SumPlayer2() {
        return RollDice.RollDicePlayer2()[0] + RollDice.RollDicePlayer2()[1];
    }

    public static void main(String[] args) {
        /*
        Test af SumPlayer1 methods
         System.out.println(SumPlayer1());
         System.out.println(SumPlayer2());
        */


    }
}
