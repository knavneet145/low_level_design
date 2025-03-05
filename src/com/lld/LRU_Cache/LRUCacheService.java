package com.lld.LRU_Cache;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCacheService <K, V> {
    private final LinkedList<Data<K, V>> list;
    private final ConcurrentHashMap<K, Data<K, V>> cache;

    public LRUCacheService() {
        this.list = new LinkedList<>();
        cache = new ConcurrentHashMap<>();
    }

    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }

        list.remove(cache.get(key));
        list.addFirst(cache.get(key));
        return list.getFirst().getVal();
    }

    public synchronized boolean put(K key, V val) {
        Data<K, V> data;
        if (cache.containsKey(key)) {
            data = cache.get(key);
            list.remove(data);
            data.setVal(val);
        }

        else {
            data = new Data<K, V>(key, val);
            if (cache.size() >= Constants.CACHE_CAPACITY) {
                cache.remove(list.getLast().getKey());
                list.removeLast();
            }
            cache.put(key, data);
        }
        list.addFirst(data);
        return true;
    }
}
