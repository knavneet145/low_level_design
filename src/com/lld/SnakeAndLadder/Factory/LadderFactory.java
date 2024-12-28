package com.lld.SnakeAndLadder.Factory;

import com.lld.SnakeAndLadder.Ladder;

public class LadderFactory {
    public static Ladder buildLadder(int base, int top) {
        return new Ladder(base, top);
    }
}
