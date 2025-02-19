package com.lld.StockBrokerageSystem.Factory;

import com.lld.StockBrokerageSystem.DAO;
import com.lld.StockBrokerageSystem.Stock;
import javafx.util.Pair;

public class StockFactory {
    private static long id = 0;
    public static Stock getInstance(String name, double price) {
        Stock stock = new Stock(String.valueOf(++id),name,price);
        //DAO.addStock(new Pair<>(stock, 1));
        return stock;
    }
}
