package spil;

public class ekstraopgave1 {

    public static int TotalScore1;
    public static int TotalScore2;

    public static int Player1Turn() {

        int[] Player1Return = new int[2];
        Player1Return[0] = TotalScore1;
        Player1Return[1] = 0;

        int DiceTotal = EyeSum.SumPlayer1();

        if (DiceTotal == 2) {
            TotalScore1 = 0;
        } else TotalScore1 = TotalScore1 + DiceTotal;
        return TotalScore1 + DiceTotal;
    }

    public static int Player2Turn() {

        int[] Player2Return = new int[2];
        Player2Return[0] = TotalScore2;
        Player2Return[1] = 0;

        int DiceTotal = EyeSum.SumPlayer2();

        if (DiceTotal == 2) {
            TotalScore2 = 0;

        } else TotalScore2 = TotalScore2 + DiceTotal;
        return TotalScore2 + DiceTotal;

        }
    }