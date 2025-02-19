package com.lld.StockBrokerageSystem.Factory;

import com.lld.StockBrokerageSystem.TradingAcount;

public class TradingAcountFactory {
    private static long id = 0;
    public static TradingAcount getInstance(String name) {
        return new TradingAcount(String.valueOf(++id), name);
    }
}
