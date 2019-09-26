package org.academiadecodigo.bootcamp36;

public class Game {

    private Player player1;
    private static final int MAX_NUMBER = 20;
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
        player1Pick = player1.choose();
        while(this.pick != player1Pick) {
            player1Pick = player1.choose();
            System.out.println("Player " + player1.getName() + " picked " + player1Pick + "and guessed wrong.");
        }

        System.out.println("Player " + player1.getName() + " guessed right. My pick was " + this.pick);
    }

}
