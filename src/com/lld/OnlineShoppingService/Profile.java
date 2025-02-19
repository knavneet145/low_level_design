package com.lld.OnlineShoppingService;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private final String userId;
    private final String userName;
    private final ShoppingCart cart;
    private final List<Order> orderHistory;

    public Profile(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.cart = new ShoppingCart(userId);
        this.orderHistory = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void appendOrder(Order order) {
        orderHistory.add(order);
    }

    public void addItemToCart(Product product, int quantity) {
        if (InventoryService.getQuantity(product.getId()) >= quantity) {
            cart.addProductToCart(product, quantity);
        }
    }
}
