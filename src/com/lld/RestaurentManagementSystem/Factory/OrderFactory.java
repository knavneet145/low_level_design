package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.Item;
import com.lld.RestaurentManagementSystem.Order;

import java.util.List;

public class OrderFactory {
    private static long id = 0;
    public static Order getOrderInstance(List<Item> items) {
        return new Order(items, String.valueOf(++id));
    }
}
