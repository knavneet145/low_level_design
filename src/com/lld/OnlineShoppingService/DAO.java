package com.lld.OnlineShoppingService;

import java.util.HashMap;
import java.util.Map;

public class DAO {
    private static final Map<String, Profile> userProfile = new HashMap<>();
    private static final Map<String, Order> orders = new HashMap<>();

    public static void addUser(Profile user) {
        userProfile.put(user.getUserId(), user);
    }

    public static Profile getUser(String id) {
        if (!userProfile.containsKey(id)) return null;
        return userProfile.get(id);
    }

    public static void addOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    public static Order getOrder(String orderId) {
        if (orders.containsKey(orderId)) {
            return orders.get(orderId);
        }
        return null;
    }
}
