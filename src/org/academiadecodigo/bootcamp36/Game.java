package org.academiadecodigo.bootcamp36;

public class Game {

    private Player player1;
    private static final int MAX_NUMBER = 50;
    private int pick;

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void run() {

        int player1Pick;

        // Generate own number pick
        this.pick = Randomizer.getRandom(MAX_NUMBER);

        // ask player 1 to pick a number
        do {
            player1Pick = this.player1.choose();
            System.out.println("Player 1 picked " + player1Pick);
        } while(this.pick != player1Pick);

        System.out.println("Player " + player1.getName() + " won!");
    }

}
