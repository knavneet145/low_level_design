package com.lld.RestaurentManagementSystem;

public class Billing {
    public void generateBill(Order order) {
        System.out.println("Generating bill for order "+order.getId());
    }
}
