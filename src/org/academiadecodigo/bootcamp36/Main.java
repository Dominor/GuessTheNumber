package org.academiadecodigo.bootcamp36;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Pythagoras");
        Game game = new Game();
        game.setPlayer1(player1);
        game.run();
    }
}
