package org.academiadecodigo.bootcamp36;

public class Game {

    private Player[] players;
    private int pick;

    // Constants
    private static final int MAX_NUMBER = 20;
    private static final int NUMBER_PLAYERS = 2;

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }

    public void setupPlayers(Player[] players) {
        this.players = players;
    }

    public void run() {

        int[] playersPicks = new int[MAX_NUMBER];
        pick = Randomizer.getRandom(MAX_NUMBER);
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            players[i].choose();
        }


    }
}
