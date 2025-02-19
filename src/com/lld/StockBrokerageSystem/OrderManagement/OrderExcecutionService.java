package com.lld.StockBrokerageSystem.OrderManagement;

import com.lld.StockBrokerageSystem.Constants.OrderType;
import com.lld.StockBrokerageSystem.DAO;
import com.lld.StockBrokerageSystem.Order;
import com.lld.StockBrokerageSystem.Stock;
import com.lld.StockBrokerageSystem.TradingAcount;
import javafx.util.Pair;

public class OrderExcecutionService {

    public static void executeBuyingOrder(Order order) {
        TradingAcount acount = DAO.getTradingAcount(order.getDmatAcId());
        for(Pair<Stock, Integer> stock: order.getOrders()) {
            DAO.addStock(new Pair<>(stock.getKey(), - stock.getValue()));
            acount.addPortfolio(stock);
        }
    }

    private static void executeSellingOrder(Order order) {
        TradingAcount acount = DAO.getTradingAcount(order.getDmatAcId());
        for(Pair<Stock, Integer> stock: order.getOrders()) {
            DAO.addStock(new Pair<>(stock.getKey(), stock.getValue()));
            acount.addPortfolio(new Pair<>(stock.getKey(), stock.getValue() * -1));
        }
    }

    public static void executeOrder(Order order) {
        if (order.getOrderType() == OrderType.BUY) {
            executeBuyingOrder(order);
        }
        else {
            executeSellingOrder(order);
        }
    }
}
