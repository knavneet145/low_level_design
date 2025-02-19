package com.lld.RestaurentManagementSystem;

import java.util.List;

public class Order {
    private final List<Item> items;
    private final String id;

    public Order(List<Item> items, String id) {
        this.items = items;
        this.id = id;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    public double getCostOfOrder() {
        double cost = 0.0;
        for (Item item: items) {
            cost += item.getPrice();
        }
        return cost;
    }
}
