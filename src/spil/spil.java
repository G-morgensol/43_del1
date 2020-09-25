package spil;

public class spil {
    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        /*

        //Test af Math.random() funktionen

        int Dice1 = (int)(Math.random()*range) + min;
        System.out.println( "Du slog " + Dice1 + " med din første terning!");
        int Dice2 = (int)(Math.random()*range) + min;
        System.out.println( "Du slog " + Dice2 + " med din anden terning!");
        int TotalEyes = Dice1 + Dice2;
        System.out.println("Summen af dit kast er: " + TotalEyes );
        */
        int Player1Score = 0;
        int Player2Score = 0;
        while (Player1Score<40 || Player2Score <40) {
            int Dice1Player1 = (int)(Math.random()*range) + min;
            int Dice2Player1 = (int)(Math.random()*range) + min;
            int TotalEyesPlayer1 = Dice1Player1 + Dice2Player1;
            Player1Score = Player1Score + TotalEyesPlayer1;
            int Dice1Player2 = (int)(Math.random()*range) + min;
            int Dice2Player2 = (int)(Math.random()*range) + min;
            int TotalEyesPlayer2 = Dice1Player2 + Dice2Player2;
            Player2Score = Player2Score + TotalEyesPlayer2;
            /* test af pointsystem

            System.out.println("Spiller 1 har " + Player1Score + " point");
            System.out.println("Spiller 2 har " + Player2Score + " point");
            */

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
//Test fra z