package com.lld.StockBrokerageSystem.OrderManagement;

import com.lld.StockBrokerageSystem.*;
import com.lld.StockBrokerageSystem.Factory.TransactionFactory;

public class OrderSettlementService {

    public static void settleOrder(Order order) {
        TradingAcount acount = DAO.getTradingAcount(order.getDmatAcId());
        Transaction transaction = TransactionFactory.getInstance(order.getCoast(), order.getDmatAcId(), order);
        acount.addTransaction(transaction);
        System.out.println("your order has been processed.");
    }
}
