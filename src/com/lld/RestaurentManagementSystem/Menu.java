package com.lld.RestaurentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Menu {
    private final List<Item> items = new ArrayList<>();
    private final InventoryManager inventoryManager = InventoryManager.getInstance();

    private static Menu instance;

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }

        return instance;
    }

    public void populateMenu() {
        for (Map.Entry<Item, Integer> entry: inventoryManager.getMenuItems().entrySet()) {
            addItem(entry.getKey());
        }
    }

    private Menu() {

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showMenu() {
        populateMenu();
        System.out.println("Showing menu...");
        for (Item item: items) {
            System.out.println("item name: "+item.getName()+ "   item price: "+item.getPrice());
        }
    }
}
