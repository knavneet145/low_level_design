package com.lld.SnakeAndLadder;

import java.security.SecureRandom;

public class DiceService {
    public static int rollDice() {
        byte[] seed = {1, 2, 3, 4, 5}; // Seed as a byte array
        SecureRandom secureRandom = new SecureRandom(seed);
        int x = secureRandom.nextInt(6) + 1;
        System.out.println(x);
        return x;
    }
}
