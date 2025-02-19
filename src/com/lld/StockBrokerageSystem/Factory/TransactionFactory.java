package com.lld.StockBrokerageSystem.Factory;

import com.lld.StockBrokerageSystem.Order;
import com.lld.StockBrokerageSystem.Transaction;

public class TransactionFactory {
    private static long id = 0;
    public static Transaction getInstance(double amount,String dmatAcId, Order order) {
        return new Transaction(String.valueOf(++id), amount, dmatAcId, order);
    }
}
