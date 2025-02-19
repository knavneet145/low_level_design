package com.lld.OnlineAuctionSystem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchService {
    private static Map<String, AuctionEvent> auctionEventMap = DAO.getAuctionsEvents();
    public static List<AuctionEvent> search(String searchString) {
        return auctionEventMap.values().stream()
                .filter(item -> item.getAuctionItem().getItemName().contains(searchString) || item.getAuctionItem().getDescription().contains(searchString))
                .collect(Collectors.toList());
    }
}
