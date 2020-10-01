package spil;

public class ekstraopgave1 {

    public static int TotalScore1;

    public static int[] Player1Turn() {

        int[] Player1Return = new int[2];
        Player1Return[0] = TotalScore1;
        Player1Return[1] = 0;

        int x = EyeSum.SumPlayer1();

        if (x == 2) {
            TotalScore1 = 0;
        }

        }

    public static int[] Player2Turn() {
        public static int TotalScore2;

        int[] Player2Return = new int[2];
        Player2Return[0] = TotalScore1;
        Player2Return[1] = 0;

        int x = EyeSum.SumPlayer2();

        if (x == 2) {
            TotalScore1 = 0;

        }

        }
