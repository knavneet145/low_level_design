package com.lld.OnlineShoppingService;

public class DisplayHistory {
    public static void displayHistory(Profile profile) {
        for (Order order: profile.getOrderHistory()) {
            System.out.println(order.getOrderId());
        }
    }
}
