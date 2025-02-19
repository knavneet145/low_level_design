package com.lld.StockBrokerageSystem;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TradingAcount {
    private final String dmatAcId;
    private final String name;
    private double balance;
    private final List<Transaction> histroy;
    private final ConcurrentHashMap<String, Integer> portfolio;

    public TradingAcount(String dmatAcId, String name) {
        this.dmatAcId = dmatAcId;
        this.balance = 0.0;
        this.histroy = new ArrayList<>();
        this.portfolio = new ConcurrentHashMap<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDmatAcId() {
        return dmatAcId;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getHistroy() {
        return histroy;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addTransaction(Transaction transaction) {
        histroy.add(transaction);
    }

    public void addPortfolio(Pair<Stock, Integer> stock) {
        portfolio.put(stock.getKey().getId(), portfolio.getOrDefault(stock.getKey().getId(), 0) + stock.getValue());
        if (portfolio.get(stock.getKey().getId()) == 0) {
            portfolio.remove(stock.getKey().getId());
        }
    }

    public ConcurrentHashMap<String, Integer> getPortfolio() {
        return portfolio;
    }

    public void printHistory() {
        System.out.println("you had transactions within your acount..");
        for (Transaction transaction: histroy) {
            System.out.println(transaction.getTransactionId() + "  involves in amount" + transaction.getOrder().getCoast());
        }
    }
}
