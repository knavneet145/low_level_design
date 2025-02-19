package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.InventoryManager;
import com.lld.RestaurentManagementSystem.Item;

public class ItemFactory {
    private static long id = 0;
    private static final InventoryManager inventoryManager = InventoryManager.getInstance();

    public static Item getItemInstance(String name, double price) {
        Item item =  new Item(String.valueOf(++id), name, price);
        inventoryManager.addMenuItem(item);
        return item;
    }
}
