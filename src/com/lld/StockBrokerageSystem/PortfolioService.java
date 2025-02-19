package com.lld.StockBrokerageSystem;

import com.lld.StockBrokerageSystem.Constants.OrderType;
import javafx.util.Pair;
import java.util.Map;

public class PortfolioService {
    public static void printPortfolio(String dmatAcId) {
        TradingAcount acount = DAO.getTradingAcount(dmatAcId);
        System.out.println("your portfolio contains..");
        for (Map.Entry<String, Integer> stock: acount.getPortfolio().entrySet()) {
            Pair<Stock, Integer> stock1 = DAO.getStock(stock.getKey());
            System.out.println(stock1.getKey().getName() + "   " + stock.getValue());
        }
    }

    public static void updatePortfolio(String dmatAcId, Order order) {
        if (order.getOrderType() == OrderType.BUY) {
            TradingAcount acount = DAO.getTradingAcount(dmatAcId);
            for (Pair<Stock, Integer> stock: order.getOrders()) {
                acount.getPortfolio().put(stock.getKey().getId(), acount.getPortfolio().getOrDefault(stock.getKey().getId(), 0) + stock.getValue());
            }
        }

        else if (order.getOrderType() == OrderType.SELL) {
            TradingAcount acount = DAO.getTradingAcount(dmatAcId);
            for (Pair<Stock, Integer> stock: order.getOrders()) {
                acount.getPortfolio().put(stock.getKey().getId(), acount.getPortfolio().getOrDefault(stock.getKey().getId(), 0) - stock.getValue());
            }
        }
    }
}
