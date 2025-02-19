package com.lld.StockBrokerageSystem;

import javafx.util.Pair;

public class LiveFeedService {
    public static void getAllAvailableStocks() {
        System.out.println("All available stocks...");
        for (Pair<Stock, Integer> stock: DAO.getStocks().values()) {
            System.out.print(stock.getKey().getName() + "  currnt price: "+ stock.getKey().getPrice() + "  available quantity:"+stock.getValue());
            System.out.println("");
        }
    }
}
