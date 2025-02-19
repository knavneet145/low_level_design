package com.lld.OnlineShoppingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private static final Map<String, Product> products = new HashMap<>();
    private static final Map<String, Double> productQuantity = new HashMap<>();

    public static void addItem(Product product, int quantity) {
        if (!products.containsKey(product.getId())) {
            products.put(product.getId(), product);
        }
        productQuantity.put(product.getId(), productQuantity.getOrDefault(product.getId(), 0.0) + quantity);
    }

    public static double getQuantity(String productId) {
        if (productQuantity.containsKey(productId)) return productQuantity.get(productId);
        return 0.0;
    }

    public static void removeProducts(String productId, int quantity) {
        if (!products.containsKey(productId)) return;
        double availableQuantity = productQuantity.get(productId);
        if (quantity >= availableQuantity) {
            productQuantity.remove(productId);
            products.remove(productId);
        }
        else {
            productQuantity.put(productId, productQuantity.get(productId) - quantity);
        }
    }

    public static void updateProduct(Product product) {
        products.put(product.getId(), product);
    }

    public static List<Product> getProductsOfCategory(ProductCategory productCategory) {
        List<Product> result = new ArrayList<>();
        for (Map.Entry<String, Product> entry: products.entrySet()) {
            if (entry.getValue().getCategory() == productCategory) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

}
