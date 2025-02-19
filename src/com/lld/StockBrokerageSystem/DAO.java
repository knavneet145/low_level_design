package com.lld.StockBrokerageSystem;

import javafx.util.Pair;
import java.util.concurrent.ConcurrentHashMap;

public class DAO {
    private static final ConcurrentHashMap<String, Pair<Stock, Integer>> stocks = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, TradingAcount> accounts = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, Pair<Stock, Integer>> getStocks() {
        return stocks;
    }
    public static ConcurrentHashMap<String, TradingAcount> getAccounts() {
        return accounts;
    }
    public static Pair<Stock, Integer> getStock(String stockId) {
        return stocks.getOrDefault(stockId, null);
    }
    public static TradingAcount getTradingAcount(String acountId) {
        return accounts.getOrDefault(acountId, null);
    }
    public static void addTradingAcount(TradingAcount acount) {
        accounts.put(acount.getDmatAcId(), acount);
    }
    public static void addStock(Pair<Stock, Integer> stock) {
        String stockId = stock.getKey().getId();
        if (stocks.containsKey(stockId)) {
            Pair<Stock, Integer> stockData = stocks.get(stockId);
            Pair<Stock, Integer> modifiedData = new Pair<>(stock.getKey(), stockData.getValue() + stock.getValue());
            stocks.put(stockId, modifiedData);
        }
        else {
            stocks.put(stockId, new Pair<Stock, Integer>(stock.getKey(), stock.getValue()));
        }
    }
}
