package com.lld.RestaurentManagementSystem;

import java.util.concurrent.ConcurrentHashMap;

public class InventoryManager {
    private static final ConcurrentHashMap<Item, Integer> menuItems = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Ingredient, Integer> ingredients = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Item, Integer> soldItems = new ConcurrentHashMap<>();
    private static InventoryManager inventoryManager;

    public static InventoryManager getInstance() {
        if (inventoryManager == null) {
            inventoryManager = new InventoryManager();
        }
        return inventoryManager;
    }

    private InventoryManager() {
    }

    public void addMenuItem(Item item) {
        menuItems.put(item, menuItems.getOrDefault(item, 0) + 1);
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.put(ingredient, ingredients.getOrDefault(ingredient, 0) + 1);
    }

    public void deleteMenuItem(Item item) {
        menuItems.remove(item);
    }

    public void deleteIngredientItem(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public Integer getMenuItemQuantity(Item item) {
        return menuItems.getOrDefault(item, 0);
    }

    public Integer getIngredientQuantity(Ingredient ingredient) {
        return ingredients.getOrDefault(ingredient, 0);
    }

    public void takeMenuItems(Item item, int quantity) {
        if (menuItems.getOrDefault(item, 0) >= quantity) {
            menuItems.put(item, menuItems.getOrDefault(item, 0) - quantity);
            soldItems.put(item, soldItems.getOrDefault(item, 0) + quantity);
            if (menuItems.getOrDefault(item, 0) == 0) {
                menuItems.remove(item);
            }
        }
    }

    public ConcurrentHashMap<Item, Integer> getSoldItems() {
        return soldItems;
    }

    public ConcurrentHashMap<Item, Integer> getMenuItems() {
        return menuItems;
    }
}
