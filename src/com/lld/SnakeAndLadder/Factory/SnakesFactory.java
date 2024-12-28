package com.lld.SnakeAndLadder.Factory;

import com.lld.SnakeAndLadder.Snake;

public class SnakesFactory {
    public static Snake buildSnake(int head, int tail) {
        return new Snake(head, tail);
    }
}
