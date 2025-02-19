package com.lld.OnlineShoppingService;

import com.lld.OnlineShoppingService.Factory.OrderFactory;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<Product, Integer> products = new HashMap<>();
    private String userId;
    private double totalCost;

    public ShoppingCart(String userId) {
        this.userId = userId;
        this.totalCost = 0.0;
    }

    public void addProductToCart(Product product, int quantity) {
        products.put(product, quantity);
        totalCost += quantity * (product.getPrice());
    }

    public void removeProduct(Product product, int quantity) {
        products.put(product, products.getOrDefault(product, 0) - quantity);
        totalCost -= quantity * (product.getPrice());
        if (products.get(product) <= 0) {
            if (products.get(product) < 0) {
                totalCost -= product.getPrice() * products.get(product);
            }
            products.remove(product);
        }
    }

    public void clearCart() {
        products.clear();
    }

    public void placeOrder() {
        Order order = OrderFactory.getInstance(products, totalCost, userId);
        OrderService.placeOrder(order, PaymentType.CARD);
    }
}
