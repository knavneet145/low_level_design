package com.lld.OnlineAuctionSystem;

import java.util.List;

public class NotificationService {
    public static void notify(List<Bid> bidders, Bid highesBid) {
        for (Bid bid: bidders) {
            User user = DAO.getUser(bid.getUserId());
            System.out.println(user.getUserName()+", " + highesBid.getUserId()+" just bidded with "+highesBid.getAmount());
        }
    }
}
