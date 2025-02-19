package com.lld.OnlineAuctionSystem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class DisplayEvents {
    public static void displayActiveBids() {
        System.out.println("Displaying active bids..");
        List<AuctionEvent> auctionEvents = DAO.getActiveEvents();
        for (AuctionEvent event: auctionEvents) {
            System.out.println("Ongoing bid is for: " + event.getAuctionItem().getItemName() + "finishing time: " + event.getFinishingTime());
        }
    }

    public static void displaySearchResults(String searchWord) {
        System.out.println("Displaying search results for " + searchWord);
        List<AuctionEvent> resultList = SearchService.search(searchWord);
        for (AuctionEvent event: resultList) {
            System.out.println(event.getAuctionItem().getItemName() + "  " + event.getAuctionItem().getDescription());
        }
    }

    public static void displayWinners() {
        Map<String, AuctionEvent> auctionEventMap = DAO.getAuctionsEvents();
        for (Map.Entry<String, AuctionEvent> entry: auctionEventMap.entrySet()) {
            if (entry.getValue().getFinishingTime().isBefore(LocalDateTime.now())) {
                String winnerName = DAO.getUser(entry.getValue().getHighestBid().getUserId()).getUserName();
                System.out.println(winnerName + " has won the " + entry.getValue().getAuctionItem().getItemName() + " auction.");
            }
        }
    }
}
