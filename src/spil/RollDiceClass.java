package spil;

public class RollDiceClass {
    static int[] RollDicePlayer1() {
        int[] Player1Dice = new int[2];
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        Player1Dice[0] = (int)(Math.random()*range) + min;
        Player1Dice[1] = (int)(Math.random()*range) + min;
        return Player1Dice;

    }
    static void RollDicePlayer2() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int Dice1Player2 = (int)(Math.random()*range) + min;
        int Dice2Player2 = (int)(Math.random()*range) + min;

    }

    public static void main(String[] args) {
        int[] Player1Dice = RollDicePlayer1();
        System.out.println("Dice 1: " + Player1Dice[0]);
        System.out.println("Dice 2: " + Player1Dice[1]);

    }
}
