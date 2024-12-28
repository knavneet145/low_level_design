package com.lld.SnakeAndLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final List<Player> players = new ArrayList<>();
    private final Map<Integer, Snake> snakeMap = new HashMap<>();
    private final Map<Integer, Ladder> ladderMap = new HashMap<>();
    private static Board boardInstance;

    private Board() {
    }



    public static Board getBoardInstance() {
        if (boardInstance == null) {
            boardInstance = new Board();
        }
        return boardInstance;
    }

    public Map<Integer, Snake> getSnakeMap() {
        return snakeMap;
    }

    public Map<Integer, Ladder> getLadderMap() {
        return ladderMap;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addLadder(Ladder ladder) {
        ladderMap.put(ladder.getBasePosition(), ladder);
    }

    public void addSnake(Snake snake) {
        snakeMap.put(snake.getHeadPosition(), snake);
    }
}
