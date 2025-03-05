package com.lld.LRU_Cache;

public class Data <K, V>{
    private final K key;
    private V val;

    public Data(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }
}
