package com.lld.ParkingLot.Factory;

import com.lld.ParkingLot.Level;

public class LevelFactory {
    private static long id = 0;
    public static Level getLevelInstance(int floor) {
        System.out.println("Level is been created.");
        return new Level(floor, String.valueOf(++id));
    }
}
