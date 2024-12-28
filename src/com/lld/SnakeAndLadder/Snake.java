package com.lld.SnakeAndLadder;

public class Snake {
    private final int headPosition;
    private final int tailPosition;

    public Snake(int headPosition, int tailPosition) {
        this.headPosition = headPosition;
        this.tailPosition = tailPosition;
    }

    public int getHeadPosition() {
        return headPosition;
    }

    public int getTailPosition() {
        return tailPosition;
    }
}
