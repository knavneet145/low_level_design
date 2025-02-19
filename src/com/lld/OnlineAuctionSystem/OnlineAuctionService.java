package com.lld.OnlineAuctionSystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class OnlineAuctionService {
    private final ExecutorService executorService = Executors.newFixedThreadPool(2);
    private final ScheduledExecutorService executorService2 = Executors.newScheduledThreadPool(2);
    private static OnlineAuctionService instance;

    // private constructor
    private OnlineAuctionService(){}

    // following singleton design pattern
    public static OnlineAuctionService getInstance() {
        if (instance == null){
            instance = new OnlineAuctionService();
        }
        return instance;
    }

    // handling requests for incoming bids
    public void requestForBid(Bid bid, String auctionEventId) {
        executorService.submit(() -> {
            System.out.println("New bid has come from " + DAO.getUser(bid.getUserId()).getUserName() + " for " + bid.getAmount());
            AuctionEvent event = DAO.getAuctionEvent(auctionEventId);
            event.incomingNewBid(bid);
        });
    }

    public void displayActiveBids() {
        executorService.submit(DisplayEvents::displayActiveBids);
    }

    public void displaySearchResult(String searchWord) {
        executorService.submit(()->DisplayEvents.displaySearchResults(searchWord));
    }

    public void displayWinners() {
        executorService2.scheduleAtFixedRate(DisplayEvents::displayWinners, 0, 5, TimeUnit.SECONDS);
    }
}
