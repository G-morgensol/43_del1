package spil;

import java.util.Scanner;

public class Players {
    public static boolean Player1End;
    public static boolean Player2End;
    private static int TotalScore2;
    private static int TotalScore1;
    private static boolean checksixes1 = false;
    private static boolean checksixes2 = false;

    public static int[] Player1Turn() {
        int[] Player1Return = new int[2];
        Player1Return[0] = TotalScore1;
        Player1Return[1] = 0;

        //Calls 2 methods and gets 2 numbers between 1 and 6. Stores them into 2 local variables.
        int Dice1 = RollDice.RollDicePlayer1()[0];
        int Dice2 = RollDice.RollDicePlayer1()[1];

        //Gets the sum of the two die.
        int DiceTotal = Dice1 + Dice2;

        //Checks for win condition.
        if (Dice1 == Dice2 && TotalScore1 >= 40) {
            System.out.println("Player 1 won with a pair of: " + Dice1 + "'s");
            Player1Return[1]++;
            System.exit(0);
        }

        if (DiceTotal == 2) {
            TotalScore1 = 0;
        }

        else TotalScore1 = TotalScore1 + DiceTotal;

        System.out.println("Player 1 rolled: " + Dice1 + " and " + Dice2);
        System.out.println("Player 1 Score: " + TotalScore1);

        //Player will get an extra turn if the player gets a pair. sets up a while loop that breaks if untrue.
        if (Dice1 == Dice2) {

            System.out.println("Player 1 got an extra turn");
            Scanner nextroll = new Scanner(System.in);

            while (Dice1 == Dice2) {

                if(Dice1 == 6 && checksixes1) {
                        System.out.println("Player 1 has won the game by rolling two sixes in a row " + TotalScore1);
                        Player1Return[1]++;
                        System.exit(0);
                } else {
                    if(Dice1 == 6) {
                        System.out.println("Player 1 has rolled two sixes once, has a chance to win if he rolls two sixes again");
                        checksixes1 = true;
                    } else {
                        checksixes1 = false;
                    }
                    System.out.println("Press enter to roll again");
                    nextroll.nextLine();
                    Dice1 = RollDice.RollDicePlayer1()[0];
                    Dice2 = RollDice.RollDicePlayer1()[1];
                    if (Dice1 == Dice2 && TotalScore1 >= 40) {
                        System.out.println("Player 1 won with a pair of: " + Dice1 + "'s");
                        Player1Return[1]++;
                        System.exit(0);
                    }
                    System.out.println("Player 1 rolled: " + Dice1 + " and " + Dice2);
                    DiceTotal = Dice1 + Dice2;

                    if (DiceTotal == 2) {
                        TotalScore1 = 0;

                    } else TotalScore1 = TotalScore1 + DiceTotal;
                    System.out.println("Player 1 Score: " + TotalScore1);

                    if (Dice1 == Dice2) {
                        System.out.println("Player 1 got a pair! Rolling again.");
                    }
                }

            }
        // Reset checksixes if they dont roll the same number (the check before requires them to hit the same dice1 and dice2)
        } else if(checksixes1){
            checksixes1 = false;
        }
        //The Method is set to return the total score of Player 1
        return Player1Return;
    }


    public static int[] Player2Turn() {
        int[] Player2Return = new int[2];
        Player2Return[0] = TotalScore2;
        Player2Return[1] = 0;
        //Calls 2 methods and gets 2 numbers between 1 and 6. Stores them into 2 local variables.
        int Dice1 = RollDice.RollDicePlayer2()[0];
        int Dice2 = RollDice.RollDicePlayer2()[1];

        //Gets the sum of the two die.
        int DiceTotal = Dice1 + Dice2;
        //Checks for win condition.
        if (Dice1 == Dice2 && TotalScore2 >= 40) {
            System.out.println("Player 2 won with a pair of: " + Dice1 + "'s");
            Player2Return[1]++;
            System.exit(0);
        }

        if (DiceTotal == 2) {
            TotalScore2 = 0;
        }
        else TotalScore2 = TotalScore2 + DiceTotal;

        System.out.println("Player 2 rolled: " + Dice1 + " and " + Dice2);
        System.out.println("Player 2 Score: " + TotalScore2);
        //Player will get an extra turn if the player gets a pair. sets up a while loop that breaks if untrue.
        if (Dice1 == Dice2) {

            System.out.println("Player 2 got an extra turn");
            Scanner nextroll = new Scanner(System.in);
            while (Dice1 == Dice2) {

                if(Dice1 == 6 && checksixes2) {
                    System.out.println("Player 2 has won the game by rolling two sixes in a row with a score of " + TotalScore2);
                    Player2Return[1]++;
                    System.exit(0);
                } else {
                    if(Dice1 == 6) {
                        System.out.println("Player 2 has rolled two sixes once, has a chance to win if he rolls two sixes again");
                        checksixes2 = true;
                    } else {
                        checksixes2 = false;
                    }
                    System.out.println("Press enter to roll again");
                    nextroll.nextLine();
                    Dice1 = RollDice.RollDicePlayer1()[0];
                    Dice2 = RollDice.RollDicePlayer1()[1];
                    if (Dice1 == Dice2 && TotalScore2 >= 40) {
                        System.out.println("Player 2 won with a pair of: " + Dice1 + "'s");
                        Player2Return[1]++;
                        System.exit(0);
                    }
                    System.out.println("Player 2 rolled: " + Dice1 + " and " + Dice2);
                    DiceTotal = Dice1 + Dice2;

                    if (DiceTotal == 2) {
                        TotalScore2 = 0;

                    } else TotalScore2 = TotalScore2 + DiceTotal;
                    System.out.println("Player 2 Score: " + TotalScore2);

                    if (Dice1 == Dice2) {
                        System.out.println("Player 2 got a pair! Rolling again.");
                    }

                }

            }
        // Reset checksixes if they dont roll the same number (the check before requires them to hit the same dice1 and dice2)
        } else if(checksixes2) {
            checksixes2 = false;
        }
        //The Method is set to return the total score of Player 1
        return Player2Return;
    }

     }
