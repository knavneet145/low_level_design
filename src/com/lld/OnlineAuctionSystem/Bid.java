package com.lld.OnlineAuctionSystem;

import java.time.LocalDateTime;

public class Bid {
    private String userId;
    private double amount;
    private LocalDateTime timeStamp;
    private String auctionEventId;

    public Bid(String userId, double amount, LocalDateTime timeStamp, String auctionEventId) {
        this.userId = userId;
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.auctionEventId = auctionEventId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getAuctionEventId() {
        return auctionEventId;
    }
}
