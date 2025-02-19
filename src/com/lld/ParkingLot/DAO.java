package com.lld.ParkingLot;

import java.util.concurrent.ConcurrentHashMap;

public class DAO {
    private final ConcurrentHashMap<String, Level> levels = new ConcurrentHashMap<>();
    private static DAO instance;

    public static DAO getInstance() {
        if (instance == null) {
            instance = new DAO();
        }
        return instance;
    }

    public void addLevel(Level level) {
        levels.put(level.getId(), level);
    }

    public Level getLevel(String levelId) {
        return levels.getOrDefault(levelId, null);
    }

}
