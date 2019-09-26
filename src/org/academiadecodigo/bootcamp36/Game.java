package org.academiadecodigo.bootcamp36;

public class Game {

    private Player[] players;
    private int pick;

    // Constants
    private static final int MAX_NUMBER = 20;
    private static final int NUMBER_PLAYERS = 4;

    public static int getNumberPlayers() {
        return NUMBER_PLAYERS;
    }

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }

    public void setupPlayers(Player[] players) {
        this.players = players;
    }

    public void run() {

        int[] playersPicks = new int[MAX_NUMBER];
        pick = Randomizer.getRandom(MAX_NUMBER);

        for (int j = 1; j >= 0; j++) {

            System.out.println("Game Pick is " + pick + ".");
            System.out.println();
            System.out.println("Round " + j + " GO!");
            System.out.println();
            for (int i = 0; i < NUMBER_PLAYERS; i++) {

                playersPicks[i] = players[i].choose();
                System.out.println("Player " + players[i].getName() + " chose " + playersPicks[i] + ".");
            }

            for (int i = 0; i < NUMBER_PLAYERS; i++) {

                if (playersPicks[i] == pick) {
                    System.out.println("Player " + players[i].getName() + " picked right!");
                    return;
                } else {
                    System.out.println("Player " + players[i].getName() + " picked wrong!");
                }
            }
        }
    }
}
