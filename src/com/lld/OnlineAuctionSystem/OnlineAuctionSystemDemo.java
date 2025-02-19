package com.lld.OnlineAuctionSystem;

import com.lld.OnlineAuctionSystem.Factory.AuctionEventFactory;
import com.lld.OnlineAuctionSystem.Factory.AuctionItemFactory;
import com.lld.OnlineAuctionSystem.Factory.BidFactory;
import com.lld.OnlineAuctionSystem.Factory.UserFactory;

import java.time.Duration;
import java.time.LocalDateTime;

public class OnlineAuctionSystemDemo implements Runnable{

    @Override
    public void run() {
        OnlineAuctionService onlineAuctionService = OnlineAuctionService.getInstance();
        User asit = UserFactory.getInstance("Asit");
        User anuj = UserFactory.getInstance("Anuj");
        User sumit = UserFactory.getInstance("Sumit");
        User lavi = UserFactory.getInstance("Lavi");
        User navneet = UserFactory.getInstance("Navneet");

        AuctionItem kohinoor = AuctionItemFactory.getInstance("kohinoor", 100000, "precious diamond", lavi.getUserId());
        AuctionEvent kohinoorAuction = AuctionEventFactory.getInstance(kohinoor, LocalDateTime.of(2025, 2, 6, 11, 0, 0, 0), Duration.ofHours(6));

        onlineAuctionService.displaySearchResult("kohinoor");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onlineAuctionService.displayActiveBids();
        onlineAuctionService.requestForBid(BidFactory.getInstance(navneet.getUserId(), 200000, kohinoorAuction.getEventId()),kohinoorAuction.getEventId());
        onlineAuctionService.requestForBid(BidFactory.getInstance(asit.getUserId(), 250000, kohinoorAuction.getEventId()), kohinoorAuction.getEventId());
        onlineAuctionService.requestForBid(BidFactory.getInstance(sumit.getUserId(), 300000, kohinoorAuction.getEventId()), kohinoorAuction.getEventId());
        onlineAuctionService.requestForBid(BidFactory.getInstance(anuj.getUserId(), 500000, kohinoorAuction.getEventId()), kohinoorAuction.getEventId());
        onlineAuctionService.requestForBid(BidFactory.getInstance(lavi.getUserId(), 1000000, kohinoorAuction.getEventId()), kohinoorAuction.getEventId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        kohinoorAuction.setFinishingTime(LocalDateTime.now());

        onlineAuctionService.displayWinners();
    }
}
