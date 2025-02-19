package com.lld.StockBrokerageSystem.OrderManagement;

import com.lld.StockBrokerageSystem.Constants.OrderType;
import com.lld.StockBrokerageSystem.DAO;
import com.lld.StockBrokerageSystem.Order;
import com.lld.StockBrokerageSystem.Stock;
import com.lld.StockBrokerageSystem.TradingAcount;
import javafx.util.Pair;

public class OrderPlacementService {

    public static boolean isBuyable(Order order) {
        if (order.getCoast() > DAO.getTradingAcount(order.getDmatAcId()).getBalance()) {
            return false;
        }
        for (Pair<Stock, Integer> stock: order.getOrders()) {
            if (stock.getValue() > DAO.getStock(stock.getKey().getId()).getValue()) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSellable(Order order) {
        TradingAcount acount = DAO.getTradingAcount(order.getDmatAcId());
        for (Pair<Stock, Integer> stock: order.getOrders()) {
            if (acount.getPortfolio().get(stock.getKey().getId()) < stock.getValue()) return false;
        }

        return true;
    }

    public static boolean isPlacable(Order order) {
        if (order.getOrderType() == OrderType.BUY) {
            return isBuyable(order);
        }
        else {
            return isSellable(order);
        }
    }

    public static boolean placeOrder(Order order) {
        if (isPlacable(order)) {
            System.out.println("Your order" + order.getOrderId()+ " has been placed.");
            return true;
        }

        System.out.println("Your order" + order.getOrderId()+ " can not be placed");
        return false;
    }
}
