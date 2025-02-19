package com.lld.StockBrokerageSystem;

public class Stock {
    private final String id;
    private final String name;
    private double price;

    public Stock(String id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }
}
