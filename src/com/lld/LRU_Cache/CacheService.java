package com.lld.LRU_Cache;

public class CacheService <K, V> {
    private LRUCacheService<K, V> lruCacheService;

    public CacheService(){
        lruCacheService = new LRUCacheService<K, V>();
    }

    public V get(K key) {
        return lruCacheService.get(key);
    }

    public boolean put(K key, V val) {
        return lruCacheService.put(key, val);
    }
}
