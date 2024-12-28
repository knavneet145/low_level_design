package com.lld.SnakeAndLadder;

public class Ladder {
    private final int basePosition;
    private final int topPosition;

    public Ladder(int basePosition, int topPosition) {
        this.basePosition = basePosition;
        this.topPosition = topPosition;
    }

    public int getBasePosition() {
        return basePosition;
    }

    public int getTopPosition() {
        return topPosition;
    }
}
