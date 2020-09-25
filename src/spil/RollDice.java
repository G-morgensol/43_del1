package spil;

public class RollDice {

    public static int[] RollDicePlayer1() {
        //Method that returns an array with 2 random numbers between 1 and 6.
        int[] Player1Dice = new int[2];
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        Player1Dice[0] = (int)(Math.random()*range) + min;
        Player1Dice[1] = (int)(Math.random()*range) + min;
        return Player1Dice;

    }
    public static int[] RollDicePlayer2() {
        // Method that returns an array with 2 random numbers between 1 and 6.
        int[] Player2Dice = new int[2];
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        Player2Dice[0] = (int) (Math.random() * range) + min;
        Player2Dice[1] = (int) (Math.random() * range) + min;
        return Player2Dice;
    }

    public static void main(String[] args) {
        int[] Player1Dice = RollDicePlayer1();
        int[] Player2Dice = RollDicePlayer2();
        /* //Test of the 2 Methods.
        System.out.println("Player 1 Rolls");
        System.out.println("Dice 1: " + Player1Dice[0]);
        System.out.println("Dice 2: " + Player1Dice[1]);
        System.out.println("Player 1 Rolls");
        System.out.println("Dice 1: " + Player2Dice[0]);
        System.out.println("Dice 2: " + Player2Dice[1]);
*/
    }
}
