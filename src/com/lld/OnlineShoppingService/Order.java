package com.lld.OnlineShoppingService;

import java.util.Map;

public class Order {
    private final String orderId;
    private Map<Product, Integer> products;
    private double totalCost;
    private OrderStatus status;
    private final String userId;

    private Payment payment;

    public Order(String orderId, Map<Product, Integer> products, double totalCost, OrderStatus status, String userId) {
        this.orderId = orderId;
        this.products = products;
        this.totalCost = totalCost;
        this.status = status;
        this.userId = userId;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getOrderId() {
        return orderId;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getUserId() {
        return userId;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
