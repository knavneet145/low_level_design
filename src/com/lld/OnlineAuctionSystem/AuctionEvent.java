package com.lld.OnlineAuctionSystem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AuctionEvent {
    private final String eventId;
    private final AuctionItem auctionItem;
    private final LocalDateTime startTime;
    private final Duration duration;
    private LocalDateTime finishingTime;
    private List<Bid> bids;

    private Bid highestBid;

    public AuctionEvent(AuctionItem auctionItem, LocalDateTime startTime, Duration duration, String eventId) {
        this.auctionItem = auctionItem;
        this.startTime = startTime;
        this.duration = duration;
        this.eventId = eventId;
        this.finishingTime = this.startTime.plus(duration);
        this.highestBid = new Bid(null, auctionItem.getStartingPrice(), LocalDateTime.now(), eventId);
    }

    public AuctionItem getAuctionItem() {
        return auctionItem;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalDateTime getFinishingTime() {
        return finishingTime;
    }

    public String getEventId() {
        return eventId;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    public void setFinishingTime(LocalDateTime finishingTime) {
        this.finishingTime = finishingTime;
    }

    public synchronized void incomingNewBid(Bid bid) {
        if (bid.getTimeStamp().isAfter(this.finishingTime) || bid.getTimeStamp().isBefore(this.startTime)) {
            System.out.println("Invalid bid !!");
            return;
        }

        if (bid.getAmount() <= highestBid.getAmount()) {
            System.out.println("Irrelevant bid !!");
            return;
        }

        highestBid = bid;
        bids.add(bid);
        CompletableFuture.runAsync(() -> {
            NotificationService.notify(bids, highestBid);
        });
    }
}
