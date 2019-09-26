package org.academiadecodigo.bootcamp36;

public class Playground {

    public static void main(String[] args) {

        Player[] players = new Player[2];
        players[0] = new Player("Pythagoras");
        players[1] = new Player("Archimedes");
        Game firstGame = new Game();

        firstGame.setupPlayers(players);


        firstGame.run();
    }
}
