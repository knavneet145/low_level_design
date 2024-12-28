package com.lld.SnakeAndLadder;

import java.util.List;

public class SnakeAndLadderService {
    private Board board;
    private static SnakeAndLadderService snakeAndLadderService;

    public static SnakeAndLadderService getSnakeAndLadderServiceInstance() {
        if (snakeAndLadderService == null) {
            snakeAndLadderService = new SnakeAndLadderService();
        }
        return snakeAndLadderService;
    }

    public void initializeGame(List<Player> players, List<Ladder> ladders, List<Snake> snakes) {
        board  = Board.getBoardInstance();
        for (Ladder ladder: ladders) {
            board.addLadder(ladder);
        }

        for (Snake snake: snakes) {
            board.addSnake(snake);
        }

        for (Player player: players) {
            board.addPlayer(player);
        }
    }

    public void playGame() {
        while(true) {
            for (Player player : board.getPlayers()) {
                int x = DiceService.rollDice();
                int currPosition = player.getPosition();
                int movingPosition = currPosition + x;
                if (board.getLadderMap().containsKey(movingPosition)) {
                    movingPosition = board.getLadderMap().get(movingPosition).getTopPosition();
                }

                else if (board.getSnakeMap().containsKey(movingPosition)) {
                    movingPosition = board.getSnakeMap().get(movingPosition).getTailPosition();
                }

                if (movingPosition >= 100) {
                    System.out.println(player.getName() + " won the game.");
                    return;
                }

                player.setPosition(movingPosition);
            }
        }
    }
}
