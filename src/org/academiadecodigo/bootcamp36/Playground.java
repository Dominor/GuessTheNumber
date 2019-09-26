package org.academiadecodigo.bootcamp36;

public class Playground {

    public static void main(String[] args) {

        Player[] players = new Player[Game.getNumberPlayers()];
        players[0] = new Player("Pythagoras");
        players[1] = new Player("Archimedes");
        players[2] = new Player("Erastothenes");
        players[3] = new Player("Zeno");
        Game firstGame = new Game();

        firstGame.setupPlayers(players);


        firstGame.run();
    }
}
