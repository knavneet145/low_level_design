package com.lld.StockBrokerageSystem;

import com.lld.StockBrokerageSystem.Constants.OrderType;
import javafx.util.Pair;

import java.util.List;

public class Order {
    private final String orderId;
    private final List<Pair<Stock, Integer>> orders;
    private final String dmatAcId;
    private final OrderType orderType;

    public Order(String orderId, String dmatAcId, List<Pair<Stock, Integer>> orders, OrderType type) {
        this.orderId = orderId;
        this.dmatAcId = dmatAcId;
        this.orders = orders;
        this.orderType = type;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Pair<Stock, Integer>> getOrders() {
        return orders;
    }

    public String getDmatAcId() {
        return dmatAcId;
    }

    public double getCoast() {
        double amount = 0.0;
        for (Pair<Stock, Integer> stock: orders) {
            amount += stock.getKey().getPrice();
        }
        return amount;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
