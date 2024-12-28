package com.lld.SnakeAndLadder.Factory;

import com.lld.SnakeAndLadder.Player;

public class PlayerFactory {
    private static long id = 0;
    public static Player buildPlayer(String name) {
        return new Player(name, String.valueOf(++id));
    }
}
