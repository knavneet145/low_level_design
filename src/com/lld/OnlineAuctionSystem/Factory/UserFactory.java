package com.lld.OnlineAuctionSystem.Factory;

import com.lld.OnlineAuctionSystem.DAO;
import com.lld.OnlineAuctionSystem.User;

public class UserFactory {
    private static long id = 0;
    public static User getInstance(String name) {
        User user = new User(String.valueOf(++id), name);
        DAO.addUser(user);
        return user;
    }
}
