package com.lld.OnlineAuctionSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DAO {
    private static final Map<String, User> users = new ConcurrentHashMap<>();
    private static final Map<String, AuctionEvent> auctionsEvents = new ConcurrentHashMap<>();

    public static Map<String, AuctionEvent> getAuctionsEvents() {
        return auctionsEvents;
    }

    public static void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public static User getUser(String userId) {
        return users.get(userId);
    }

    public static void addAuctionEvent(AuctionEvent event) {
        auctionsEvents.put(event.getEventId(), event);
    }

    public static AuctionEvent getAuctionEvent(String eventId) {
        return auctionsEvents.get(eventId);
    }

    public static List<AuctionEvent> getActiveEvents() {
        List<AuctionEvent> activeAuctionEvents = new ArrayList<>();
        for (Map.Entry<String, AuctionEvent> entry: auctionsEvents.entrySet()) {
            if (LocalDateTime.now().isBefore(entry.getValue().getFinishingTime()) && LocalDateTime.now().isAfter(entry.getValue().getStartTime())) {
                activeAuctionEvents.add(entry.getValue());
            }
        }
        return activeAuctionEvents;
    }
}
