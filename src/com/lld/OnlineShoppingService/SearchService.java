package com.lld.OnlineShoppingService;


import java.util.List;

public class SearchService {
    public static List<Product> browseProducts(ProductCategory category) {
        return InventoryService.getProductsOfCategory(category);
    }
}
