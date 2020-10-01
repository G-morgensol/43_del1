package spil;

public class ekstraopgave2 {

    public static int TotalScore1;
    public static int TotalScore2;

    int Dice1 = RollDice.RollDicePlayer1()[0];
    int Dice2 = RollDice.RollDicePlayer1()[1];

    int DiceTotal = Dice1 + Dice2;

        if (Dice1 == Dice2) {

        System.out.println("Player 1 got an extra turn");

        while (Dice1 == Dice2) {
            System.out.println("Player 1 rolled two of the same dice! " + Dice1 + " and " + Dice2);
            if (DiceTotal == 2) {
                TotalScore1 = 0;
            }


                }
                Dice1 = RollDice.RollDicePlayer1()[0];
                Dice2 = RollDice.RollDicePlayer1()[1];

                }
                System.out.println("Player 1 rolled: " + Dice1 + " and " + Dice2);
                DiceTotal = Dice1 + Dice2;
                TotalScore1 = TotalScore1 + DiceTotal;
                System.out.println("Player 1 Score: " + TotalScore1);

                if (Dice1 == Dice2) {
                    System.out.println("Player 1 got a pair! Rolling again.");
                }
            }


}


