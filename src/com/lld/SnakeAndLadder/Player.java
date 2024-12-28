package com.lld.SnakeAndLadder;

import javafx.util.Pair;

public class Player {
    private final String name;
    private final String playerId;
    private int position;

    public Player(String name, String playerId) {
        this.name = name;
        this.playerId = playerId;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public String getPlayerId() {
        return playerId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
