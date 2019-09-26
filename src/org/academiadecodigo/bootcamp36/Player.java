package org.academiadecodigo.bootcamp36;

public class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int choose() {
        return Randomizer.getRandom(Game.getMaxNumber());
    }

}
