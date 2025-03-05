package com.lld.LRU_Cache;

public class LRUCacheServiceDemo implements Runnable{
    @Override
    public void run() {
        CacheService<String, String> cacheService = new CacheService<>();
        cacheService.put("navneet", "Progressive badminton player");
        cacheService.put("tajmahal", "One of the wonder of 7 wonders");
        System.out.println("value for tajmahal: " + cacheService.get("tajmahal"));
        System.out.println("value for navneet: " + cacheService.get("navneet"));
    }
}
