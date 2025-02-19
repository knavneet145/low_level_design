package com.lld.StockBrokerageSystem.OrderManagement;

import com.lld.StockBrokerageSystem.Order;

public class OrderManagement {
    public static void processOrder(Order order) {
        if (OrderPlacementService.placeOrder(order)) {
            OrderExcecutionService.executeOrder(order);
            OrderSettlementService.settleOrder(order);
        }
    }
}
