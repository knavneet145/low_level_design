package com.lld.OnlineShoppingService.Factory;

import com.lld.OnlineShoppingService.DAO;
import com.lld.OnlineShoppingService.Order;
import com.lld.OnlineShoppingService.OrderStatus;
import com.lld.OnlineShoppingService.Product;

import java.util.Map;

public class OrderFactory {
    private static long id = 0;
    public static Order getInstance(Map<Product, Integer> productsMap, double totalCost, String userId) {
        Order order = new Order(String.valueOf(++id), productsMap, totalCost, OrderStatus.PLACED, userId);
        DAO.addOrder(order);
        return order;
    }

}
