package com.lld.OnlineAuctionSystem.Factory;

import com.lld.OnlineAuctionSystem.Bid;

import java.time.LocalDateTime;

public class BidFactory {
    public static Bid getInstance(String userId, double amount, String auctionEventId) {
        System.out.println(LocalDateTime.now());
        return new Bid(userId,amount, LocalDateTime.now(),auctionEventId);
    }
}
