package com.lld.StockBrokerageSystem;

import java.util.List;

public class Transaction {
    private final String transactionId;
    private final double amount;
    private final String dmatAcId;
    private final Order order;

    public Transaction(String transactionId, double amount, String dmatAcId, Order order) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.dmatAcId = dmatAcId;
        this.order = order;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDmatAcId() {
        return dmatAcId;
    }

    public Order getOrder() {
        return order;
    }
}
