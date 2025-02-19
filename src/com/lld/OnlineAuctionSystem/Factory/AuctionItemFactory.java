package com.lld.OnlineAuctionSystem.Factory;

import com.lld.OnlineAuctionSystem.AuctionItem;

public class AuctionItemFactory {
    private static long id = 0;
    public static AuctionItem getInstance(String itemName, double startingPrice, String description, String sellerId) {
        return new AuctionItem(itemName, startingPrice, description, sellerId, String.valueOf(++id));
    }
}
