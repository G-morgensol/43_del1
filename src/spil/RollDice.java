package spil;

public class RollDice {

    public static int[] RollDicePlayer1() {
        //Method that returns an array with 2 random numbers between 1 and 6. (Player 1)
        int[] Player1Dice = new int[2];
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        Player1Dice[0] = (int)(Math.random()*range) + min;
        Player1Dice[1] = (int)(Math.random()*range) + min;
        //Player1Dice[0] = 1;
        //Player1Dice[1] = 1;
        return Player1Dice;

    }
    public static int[] RollDicePlayer2() {
        // Method that returns an array with 2 random numbers between 1 and 6. (Player 2)
        int[] Player2Dice = new int[2];
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        Player2Dice[0] = (int) (Math.random() * range) + min;
        Player2Dice[1] = (int) (Math.random() * range) + min;
        return Player2Dice;
    }

    /*public static void main(String[] args) {

        System.out.println(RollDicePlayer1()[0]);
        System.out.println(RollDicePlayer1()[0]);
        System.out.println(RollDicePlayer1()[0]);
        System.out.println(RollDicePlayer1()[0]);
    } */
}
