package spil;

public class EyeSum {

    //Defines a method that returns the sum of the 2 dice defined in the RollDice method. (For player 1)
    public static int SumPlayer1()
    {
        return RollDice.RollDicePlayer1()[0] + RollDice.RollDicePlayer1()[1];
    }



    public static boolean IdenticalPlayer1() {return RollDice.RollDicePlayer1()[0] == RollDice.RollDicePlayer1()[1]; }

    public static boolean IdenticalPlayer2() {return RollDice.RollDicePlayer2()[0] == RollDice.RollDicePlayer2()[1]; }

    //Defines a method that returns the sum of the 2 dice defined in the RollDice method. (For player 2)
    public static int SumPlayer2()
    {
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
