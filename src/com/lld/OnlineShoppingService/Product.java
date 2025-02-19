package com.lld.OnlineShoppingService;

public class Product {
    private String id;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(String id, String name, ProductCategory category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
