package com.lld.OnlineShoppingService.Factory;

import com.lld.OnlineShoppingService.InventoryService;
import com.lld.OnlineShoppingService.Product;
import com.lld.OnlineShoppingService.ProductCategory;

public class ProductFactory {
    private static long id = 0;
    public static Product getInstance(String name, ProductCategory category, double price) {
        Product product = new Product(String.valueOf(++id), name, category, price);
        InventoryService.addItem(product, 1);
        return product;
    }
}
