package com.lld.SnakeAndLadder;

import com.lld.SnakeAndLadder.Factory.LadderFactory;
import com.lld.SnakeAndLadder.Factory.PlayerFactory;
import com.lld.SnakeAndLadder.Factory.SnakesFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnakeAndLadderDemo implements Runnable{
    private SnakeAndLadderService snakeAndLadderService;

    public void run() {
        snakeAndLadderService = SnakeAndLadderService.getSnakeAndLadderServiceInstance();
        Player navneet = PlayerFactory.buildPlayer("Navneet");
        Player arunav = PlayerFactory.buildPlayer("Arunav");
        List<Player> playerList = new ArrayList<>(Arrays.asList(navneet, arunav));
        List<Ladder> ladderList = new ArrayList<>(Arrays.asList(
                LadderFactory.buildLadder(9, 99),
                LadderFactory.buildLadder(36, 74),
                LadderFactory.buildLadder(45, 87),
                LadderFactory.buildLadder(23, 97)));

        List<Snake> snakeList = new ArrayList<>(Arrays.asList(
                SnakesFactory.buildSnake(97, 9),
                SnakesFactory.buildSnake(87, 34),
                SnakesFactory.buildSnake(67, 21),
                SnakesFactory.buildSnake(45, 15)
        ));

        snakeAndLadderService.initializeGame(playerList, ladderList, snakeList);
        snakeAndLadderService.playGame();
    }
}
