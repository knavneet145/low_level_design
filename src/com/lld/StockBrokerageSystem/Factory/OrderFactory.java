package com.lld.StockBrokerageSystem.Factory;

import com.lld.StockBrokerageSystem.Constants.OrderType;
import com.lld.StockBrokerageSystem.Order;
import com.lld.StockBrokerageSystem.Stock;
import javafx.util.Pair;

import java.util.List;

public class OrderFactory {
    private static long id = 0;
    public static Order getInstance(String dmatAcId, List<Pair<Stock, Integer>> orders, OrderType type) {
        return new Order(String.valueOf(++id),dmatAcId,orders,type);
    }
}
