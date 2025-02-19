package com.lld.OnlineShoppingService;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class OrderService {
    public static boolean placeOrder(Order order, PaymentType type) {
        if (isOrderPlacable(order)) {
            PaymentService.payUsingCard(order.getTotalCost(), order.getOrderId());
            System.out.println("Payment completed for order: " + order.getOrderId());
            CompletableFuture.runAsync(() -> {
                Profile user = DAO.getUser(order.getUserId());
                user.appendOrder(order);
            });
            return true;
        }
        return false;
    }

    private static boolean isOrderPlacable(Order order) {
        Map<Product, Integer> products = order.getProducts();
        for (Map.Entry<Product, Integer> entry: products.entrySet()) {
            if (entry.getValue() > InventoryService.getQuantity(entry.getKey().getId())) return false;
        }
        return true;
    }
}
