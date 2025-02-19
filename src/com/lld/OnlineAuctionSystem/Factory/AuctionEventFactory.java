package com.lld.OnlineAuctionSystem.Factory;

import com.lld.OnlineAuctionSystem.AuctionEvent;
import com.lld.OnlineAuctionSystem.AuctionItem;
import com.lld.OnlineAuctionSystem.DAO;

import java.time.Duration;
import java.time.LocalDateTime;

public class AuctionEventFactory {
    private static long id = 0;
    public static AuctionEvent getInstance(AuctionItem auctionItem, LocalDateTime startTime, Duration duration) {
        AuctionEvent auctionEvent = new AuctionEvent(auctionItem, startTime, duration, String.valueOf(++id));
        DAO.addAuctionEvent(auctionEvent);
        return auctionEvent;
    }
}
