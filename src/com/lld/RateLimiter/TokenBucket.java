package com.lld.RateLimiter;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.*;

public class TokenBucket {
    private int capacity;
    private int refillRate;
    private final ConcurrentHashMap<Integer, Integer> bucket = new ConcurrentHashMap<>();

    public TokenBucket(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(populateBucket,0, 1, TimeUnit.SECONDS);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRefillRate() {
        return refillRate;
    }

    public void addUser(int userID) {
        bucket.put(userID, 0);
    }

    public boolean serveRequest(int userId) {
        if (bucket.get(userId) > 0) {
            bucket.put(userId, bucket.get(userId) - 1);
            return true;
        }
        return false;
    }

    private final Runnable populateBucket = () -> {
        for (Map.Entry<Integer, Integer> entry : bucket.entrySet()) {
            entry.setValue(Math.min(entry.getValue() + refillRate, capacity));
        }
    };
}
