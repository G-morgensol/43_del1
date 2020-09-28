package spil;
public class spil {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            System.out.println("Player 1 turn");
            Players.Player1Turn();
            System.out.println("Player 2 turn");
            Players.Player2Turn();


            //In the unlikely case the game isnt over after 100 iterations, break;
            i++;
            if (i ==100) {
                break;
            }
        }
    }
}
