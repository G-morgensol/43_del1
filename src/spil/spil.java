package spil;
public class spil {
    public static void main(String[] args) {

        int Player1Score = 0;
        int Player2Score = 0;
        while (Player1Score<40 || Player2Score <40) {
            Player1Score = Player1Score + EyeSum.SumPlayer1();
            Player2Score = Player2Score + EyeSum.SumPlayer2();
        }
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
