package com.lld.OnlineAuctionSystem;

public class AuctionItem {
    private final String itemId;
    private final String itemName;
    private final double startingPrice;
    private final String description;
    private final String sellerId;

    public AuctionItem(String itemName, double startingPrice, String description, String sellerId, String itemId) {
        this.itemName = itemName;
        this.startingPrice = startingPrice;
        this.description = description;
        this.sellerId = sellerId;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getSellerId() {
        return sellerId;
    }
}
