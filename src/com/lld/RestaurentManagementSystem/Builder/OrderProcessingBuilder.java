package com.lld.RestaurentManagementSystem.Builder;

import com.lld.RestaurentManagementSystem.Billing;
import com.lld.RestaurentManagementSystem.OrderPreparation;
import com.lld.RestaurentManagementSystem.OrderProcessing;
import com.lld.RestaurentManagementSystem.Payment;

public class OrderProcessingBuilder {
    private OrderProcessing orderProcessing;

    public OrderProcessingBuilder() {
        this.orderProcessing = new OrderProcessing();
    }

    public OrderProcessing setOrderPreparation(OrderPreparation orderPreparation) {
        orderProcessing.setOrderPreparation(orderPreparation);
        return orderProcessing;
    }

    public OrderProcessing setBilling(Billing billing) {
        orderProcessing.setBilling(billing);
        return orderProcessing;
    }

    public OrderProcessing setPayment(Payment payment) {
        orderProcessing.setPayment(payment);
        return orderProcessing;
    }
}
